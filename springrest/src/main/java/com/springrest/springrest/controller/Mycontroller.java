package com.springrest.springrest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;  
import org.springframework.web.bind.annotation.*;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import com.springrest.springrest.services.*;
@RestController
public class Mycontroller {
    @Autowired
	private CourseService courseService;
	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable Long courseId)
	{
		return this.courseService.getCourse(courseId);
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseService.updateCourse(course);
	}
	
}
