package com.simex.blogApp.service;

import com.simex.blogApp.data.model.Blog;
import com.simex.blogApp.data.repositories.BlogRepository;
import com.simex.blogApp.exceptions.BlogException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogRepository blogRepository;

//   private final List<Blog> myBlog =List.of(new Blog(1L,"My firsts blog","This is really hard doing my personal spring boot project", LocalDate.now()));
    @Override
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll() ;
    }

    @Override
    public Blog getBlog(Long id) {
        return blogRepository.findById(id).orElseThrow(() ->new BlogException("Post not found at " + id));
    }

    @Override
    public void postBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void updateBlog(Blog blog, Long id) {
        Blog foundBlog = blogRepository.findById(id).orElseThrow(() -> new BlogException("Post with id " + id + " not found"));
        blog.setTitle(foundBlog.getTitle());
        blog.setDescription(foundBlog.getDescription());
        blog.setId(foundBlog.getId());
//        blog.setDate(LocalDateTime.now());
    }

    @Override
    public void deleteBlog(Long id) {
        Blog foundBlog = blogRepository.findById(id).orElseThrow(() -> new BlogException("Post with id " + id + " not found"));
        blogRepository.delete(foundBlog);

    }


}
