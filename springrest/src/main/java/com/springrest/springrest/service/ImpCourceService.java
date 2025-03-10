package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entitiy.Course;

@Service
public class ImpCourceService implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	//List<Course> list;
	
	
	public ImpCourceService() {
		
//		list = new ArrayList<>();
//		list.add(new Course(121, "Network","All concept of networking "));
//		list.add(new Course(131, "Core Java","this contain basic of java"));
//		list.add(new Course(141," Spring boot","this contain advance java "));
		
		
		
		
	}

	@Override
	public List<Course> getCourse() {

		return courseDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
		
//		Course c= null;
//		
//		for(Course course: list) {
//			
//			if(course.getId() == courseId) {
//				
//				c= course;
//			}
//		}
//		
//		return c;
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		
		//list.add(course);
		
		return courseDao.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		
//		list.forEach(e -> {
//			if(e.getId()== course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		//list= this.list.stream().filter(e->e.getId() != parseLong).collect(Collectors.toList());
		
		Course entity= courseDao.getOne(parseLong);
		courseDao.delete(entity);
		
	}

	

	

	


	
	

}
