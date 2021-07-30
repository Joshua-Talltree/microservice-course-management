package com.josh.microservicecoursemanagement.service;

import com.josh.microservicecoursemanagement.model.Course;
import com.josh.microservicecoursemanagement.model.Transaction;

import java.util.List;

public interface CourseService {
    List<Course> allCourse();

    Course findCourseById(Long courseId);

    List<Transaction> findTransactionsOfUser(Long userId);

    List<Transaction> findTransactionsOfCourse(Long courseId);

    Transaction saveTransaction(Transaction transaction);
}
