package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@RestController
public class SpringbootOpenshiftJBossEAPExampleApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOpenshiftJBossEAPExampleApplication.class, args);
	}
	
	@GetMapping("/info")
	public String welcome() {
		return "++++++++++++++++++++++++++++ Welcome to IBM Redhat Openshift Experiential Squad .++++++++++++++++++++++++++++ ";
	}

	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Hello " + input + ", Your application deployed successfully. Cheers...!!!";
	}
	
	@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
			return builder.sources(SpringbootOpenshiftJBossEAPExampleApplication.class);
		}


}
