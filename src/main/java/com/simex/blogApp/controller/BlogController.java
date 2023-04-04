package com.simex.blogApp.controller;

import com.simex.blogApp.data.model.Blog;
import com.simex.blogApp.service.BlogServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/")
public class BlogController {
    @Autowired
    private BlogServiceImpl  blogService;

    @GetMapping("/blogs")
    public List<Blog> getAllBlogs(){
        return blogService.getAllBlogs() ;
    }

    @GetMapping("blog/{id}")
    public Blog getBlog(@PathVariable Long id){
        return blogService.getBlog(id);
    }
    @PostMapping("blogs")
    public void createBlog(@RequestBody Blog blog){
        blogService.postBlog(blog);
    }
    @PostMapping("blog/{id}")
    public  void updateBlog(@RequestBody Blog blog, @PathVariable Long id){
        blogService.updateBlog(blog,id);
    }
    @DeleteMapping("blog/{id}")
    public void deleteBlog(@PathVariable Long id){
        blogService.deleteBlog(id);
    }
}
