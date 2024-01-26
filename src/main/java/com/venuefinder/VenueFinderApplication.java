package com.venuefinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class VenueFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(VenueFinderApplication.class, args);
	}

}
