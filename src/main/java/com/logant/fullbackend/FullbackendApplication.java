package com.logant.fullbackend;

import com.logant.fullbackend.config.RSAKeyRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RSAKeyRecord.class)
@SpringBootApplication
public class FullbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullbackendApplication.class, args);
	}

}
