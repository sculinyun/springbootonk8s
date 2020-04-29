package com.k8s.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	@RequestMapping(value = "/v1")
	static class AppController {


		@RequestMapping(value = "/hello", method = RequestMethod.GET)
		@ResponseBody
		public String hello() {
			System.out.println("*********123*********");
			return "Hello, Kubernetes!";
		}


	}
}
