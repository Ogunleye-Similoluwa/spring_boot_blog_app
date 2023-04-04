package com.simex.blogApp.service;

import com.simex.blogApp.data.model.Blog;

import java.util.List;

public interface BlogService {

    List<Blog> getAllBlogs();

    Blog getBlog(Long id);

    void postBlog(Blog blog);

    void updateBlog(Blog blog, Long id);

    void deleteBlog(Long id);
}
