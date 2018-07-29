package com.cu.thesis.WeMuBPMN;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WeMuBpmnApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeMuBpmnApplication.class, args);
	}
}
