package com.iot.rashome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EntityScan("com.iot.rashome.vo")
@EnableJpaRepositories("com.iot.rashome.dao")
@EnableScheduling
public class RashomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RashomeApplication.class, args);
	}

}
