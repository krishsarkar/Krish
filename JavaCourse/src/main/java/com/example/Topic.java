package com.example;

public class Topic {
	
	private int id;
	private String courseName;
	private String courseDetail;
	
	public Topic(int id, String courseName, String courseDetail) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseDetail = courseDetail;
	}
    
	public Topic() {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDetail() {
		return courseDetail;
	}

	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}
}
