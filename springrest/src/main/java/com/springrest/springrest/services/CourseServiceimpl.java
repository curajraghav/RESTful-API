package com.springrest.springrest.services;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {
    @Autowired
	private CourseDao courseDao;
	//List<Course> list;
    public CourseServiceimpl()
    {
    	//list=new ArrayList<>();
    	//list.add(new Course(145,"Java Core Course","this contain basics of java"));
    	//list.add(new Course(4343,"spring Course","this contain spring course"));
    }
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	//@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
		//Course c=null;
	//	for(Course course:list)
	//	{
	//		if(course.getId()==courseId)
	//		{
	//			c=course;
	//			break;
		//	}
		Optional<Course> optionalCourse = courseDao.findById(courseId);
	    return optionalCourse.orElse(null);
	}

	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		//list.forEach(e->{
		//	if(e.getId()==course.getId())
		//	{
		//		e.setTitle(course.getTitle());
		//		e.setDescription(course.getDescription());
		//	}
		//});
		courseDao.save(course);
		return course;
	}
      
}
