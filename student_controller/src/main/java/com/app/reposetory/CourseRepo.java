package com.app.reposetory;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Course;

public interface CourseRepo extends JpaRepository<Course, Long>{
	
	public List<Course> findAll();
	public Course findCourseByCourseName(String courseName);
}
