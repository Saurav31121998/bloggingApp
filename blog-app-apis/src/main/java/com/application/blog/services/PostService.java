package com.application.blog.services;

import java.util.List;

import com.application.blog.payloads.PostDto;
import com.application.blog.payloads.PostResponse;

public interface PostService {

//create

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

//update

	PostDto updatePost(PostDto postDto, Integer postId);

//get All Post

	PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sortBy,String sortDir);

//get Single Post

	PostDto getPostById(Integer postId);

//delete post

	void deletePost(Integer postId);
	
//get all posts By category
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
//get all posts By user
	
	List<PostDto> getPostsByUser(Integer userId);
	
// search post	
	List<PostDto> searchPosts(String keyword);
	
	

}
