package com.jossdarky.abstractclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jossdarky.abstractclass.controller.IConsoleController;

@SpringBootApplication
public class AbstractClassApplication implements CommandLineRunner {

	@Autowired
	IConsoleController consoleController;

	public static void main(String[] args) {
		SpringApplication.run(AbstractClassApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		consoleController.process();
	}

}
