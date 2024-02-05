package com.application.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.blog.entities.Post;
import com.application.blog.entities.User;
import com.application.blog.entities.Category;



public interface PostRepo extends JpaRepository<Post, Integer> {
	
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);
}
