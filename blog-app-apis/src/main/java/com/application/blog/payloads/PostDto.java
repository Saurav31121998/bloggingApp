package com.application.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.application.blog.entities.Comment;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostDto {
	
	private Integer postId;
    private String content;
    private String title;
    private String image;
    private Date addedDate;
    private CategoryDto category;
    private UserDto user;
    private Set<CommentDto> comments = new HashSet<>();
}