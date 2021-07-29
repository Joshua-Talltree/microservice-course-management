package com.josh.microservicecoursemanagement.service;

import com.josh.microservicecoursemanagement.model.Course;
import com.josh.microservicecoursemanagement.model.Transaction;
import com.josh.microservicecoursemanagement.repository.CourseRepository;
import com.josh.microservicecoursemanagement.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<Course> allCourse() {
        return courseRepository.findAll();
    }

    @Override
    public Course findCourseById(Long courseId) {
        return courseRepository.findById(courseId).orElse(null);
    }

    @Override
    public List<Transaction> findTransactionsOfUser (Long userId) {
        return transactionRepository.findAllByUserId(userId);
    }

    public List<Transaction> findTransactionsOfCourse(Long courseId) {
        return transactionRepository.findAllByCourseId(courseId);
    }

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}

