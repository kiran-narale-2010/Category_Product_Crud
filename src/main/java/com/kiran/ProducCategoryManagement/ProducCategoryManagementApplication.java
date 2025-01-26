package com.kiran.ProducCategoryManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.kiran.entity")
@ComponentScan("com.kiran")
@EnableJpaRepositories("com.kiran.repository")
public class ProducCategoryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducCategoryManagementApplication.class, args);
		System.out.println("Project run Sucssfully");
	}

}
