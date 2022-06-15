package com.rubenleerentveld.mlbcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@SpringBootApplication
public class MlbcenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MlbcenterApplication.class, args);
	}

}
