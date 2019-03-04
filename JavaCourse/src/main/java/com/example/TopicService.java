package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(1, "Spring", "Java Framework"),
			new Topic(2, "Java", "Java SE"),
			new Topic(3,"Javascript", "Scripting Language")));

	public List<Topic> getAllTopics() {

		return topics;
	}

	public Topic getTopic(int id) {

	return topics.stream().filter(t -> t.getId()==id).findFirst().get();	
	
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(int id, Topic topic) {
		for(int i=0; i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId()==id) {
				topics.set(id-1, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(int id, Topic topic) {
		
		topics.removeIf(t -> t.getId()==id);
		
	}
}
