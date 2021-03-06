package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemouuetApplication {

	public static void main(String[] args) {

			String ENV_PORT = System.getenv().get("PORT");
			String ENV_DYNO = System.getenv().get("DYNO");
			if(ENV_PORT != null && ENV_DYNO != null) {
				System.getProperties().put("server.port", ENV_PORT);
			}//

		SpringApplication.run(DemouuetApplication.class, args);
	}
}
//docker image build -t registry.heroku.com/fierce-badlands-54204/web .