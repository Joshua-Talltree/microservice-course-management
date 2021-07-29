package com.josh.microservicecoursemanagement.repository;

import com.josh.microservicecoursemanagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {


}
