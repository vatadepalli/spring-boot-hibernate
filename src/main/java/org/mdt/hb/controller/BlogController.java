package org.mdt.hb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.mdt.hb.model.blog.*;
import org.mdt.hb.repository.blog.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * BlogController
 */
@RestController
@RequestMapping("/posts")
public class BlogController {

    @Autowired
    PostRepository postRepo;

    @GetMapping(value = "")
    public List<Post> getAllPosts() {
        return postRepo.findAll();
    }

}