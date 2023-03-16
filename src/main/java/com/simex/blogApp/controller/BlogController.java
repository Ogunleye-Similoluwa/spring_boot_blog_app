package com.simex.blogApp.controller;

import com.simex.blogApp.data.model.Blog;
import com.simex.blogApp.service.BlogServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlogController {

    @Autowired
private BlogServiceImpl  blogService;

    @GetMapping("/blogs")
    public List<Blog> getAllBlogs(){
        return blogService.getAllBlogs() ;
    }
}
