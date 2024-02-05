package com.application.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.application.blog.repositories.UserRepo;

@SpringBootTest
class BlogAppApisApplicationTests {
	
	@Autowired
	private UserRepo userRepo;

	@Test
	void contextLoads() {
		
	}
	
	@Test
	public void repotest() {
		String classame = this.userRepo.getClass().getName();
		String packame = this.userRepo.getClass().getPackageName();
		System.out.println(classame);
		System.out.println(packame);
	}
	

}
