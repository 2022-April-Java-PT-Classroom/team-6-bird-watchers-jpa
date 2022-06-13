package org.wecancodeit.birdwatcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BirdWatcherApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BirdWatcherApplication.class, args);
	}

}
