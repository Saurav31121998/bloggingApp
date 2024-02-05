package com.application.blog.services;

import java.util.List;

import com.application.blog.payloads.CategoryDto;

public interface CategoryService {

	// create

	CategoryDto createCategory(CategoryDto categoryDto);

	// update

	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	// get category

	CategoryDto getCategory(Integer catInteger);

	// get All category

	List<CategoryDto> getCategories();

	// Delete category

	void deleteCategory(Integer categoryId);

}
