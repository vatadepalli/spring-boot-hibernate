package org.mdt.hb.controller;

import org.mdt.hb.repository.CourseRepository;
import org.mdt.hb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ActsController
 */
@RestController
@RequestMapping("/acts")
public class ActsController {
    @Autowired
    StudentRepository studentRepo;

    @Autowired
    CourseRepository courseRepo;

    // Get all courses

    // Get all students

}