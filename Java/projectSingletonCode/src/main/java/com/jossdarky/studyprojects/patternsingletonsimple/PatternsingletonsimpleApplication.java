package com.jossdarky.studyprojects.patternsingletonsimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jossdarky.studyprojects.patternsingletonsimple.service.IBusinessService;

@SpringBootApplication
public class PatternsingletonsimpleApplication implements CommandLineRunner{

	@Autowired
	IBusinessService iBusinessService;

	public static void main(String[] args) {
		SpringApplication.run(PatternsingletonsimpleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		iBusinessService.proccess();
	}


}
