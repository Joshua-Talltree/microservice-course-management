package com.josh.microservicecoursemanagement.controller;

import com.josh.microservicecoursemanagement.intercomm.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private UserClient userClient;

    //call it from methods

}
