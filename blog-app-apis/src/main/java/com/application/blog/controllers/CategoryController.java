package com.application.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.blog.payloads.ApiResponse;
import com.application.blog.payloads.CategoryDto;
import com.application.blog.services.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	// create

	@PostMapping("/")
	public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto) {
		CategoryDto createCat = this.categoryService.createCategory(categoryDto);
		return new ResponseEntity<>(createCat, HttpStatus.CREATED);

	}

	// update
	@PutMapping("/{categoryId}")
	public ResponseEntity<CategoryDto> updatedCategory(@Valid @RequestBody CategoryDto categoryDto,
			@PathVariable("categoryId") Integer uid) {
		CategoryDto updatedCategory = this.categoryService.updateCategory(categoryDto, uid);
		return ResponseEntity.ok(updatedCategory);
	}

	// delete
	@DeleteMapping("/{categoryId}")
	public ResponseEntity<ApiResponse> deleteCategory(@PathVariable("categoryId") Integer uid) {
		this.categoryService.deleteCategory(uid);
		return new ResponseEntity<ApiResponse>(new ApiResponse("category deleted successfully", true), HttpStatus.OK);
	}

	// get category
	@GetMapping("/{categoryId}")
	public ResponseEntity<CategoryDto> getCategory(@PathVariable("categoryId") Integer catInteger) {
		CategoryDto categoryDto = this.categoryService.getCategory(catInteger);
		return new ResponseEntity<CategoryDto>(categoryDto, HttpStatus.OK);
	}

	// get categories
	@GetMapping("/")
	public ResponseEntity<List<CategoryDto>> getCategories() {
		List<CategoryDto> categoryDtos = this.categoryService.getCategories();
		return ResponseEntity.ok(categoryDtos);
	}

}
