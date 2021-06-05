package com.springbank.user.cmd.api;

import com.springbank.user.core.configuration.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * This class responsible to represent principal class application for commands
 * AxonConfig responsible to connect axon server and register actions
 */
@SpringBootApplication
@Import({ AxonConfig.class })
public class UserCommandApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCommandApplication.class, args);
	}

}
