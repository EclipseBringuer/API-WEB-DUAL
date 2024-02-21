package com.gabimiguesamu.appWebDual;

import com.gabimiguesamu.appWebDual.util.Utility;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppWebDualApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppWebDualApplication.class, args);
		Utility.launchWeb();
	}

}
