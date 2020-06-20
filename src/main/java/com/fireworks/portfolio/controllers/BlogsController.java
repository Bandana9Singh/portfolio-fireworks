package com.fireworks.portfolio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fireworks.portfolio.models.Blog;
import com.fireworks.portfolio.repositories.BlogRepository;

@RestController
@RequestMapping("/blogs")
public class BlogsController {
	@Autowired
	private BlogRepository blogRepository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Blog> getAllBlogs() {
		return blogRepository.findAll();
	}
}
