package com.simex.blogApp.service;

import com.simex.blogApp.data.model.Blog;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{

   private final List<Blog> myBlog =List.of(new Blog(1L,"My firsts blog","This is really hard doing my personal spring boot project", LocalDate.now()));


    @Override
    public List<Blog> getAllBlogs() {
    return myBlog;

    }
}
