package com.springrest.springrest.service;

import java.util.List;


import com.springrest.springrest.entitiy.Course;

public interface CourseService {
	
	public List<Course> getCourse();
	
	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long courseId);



}
