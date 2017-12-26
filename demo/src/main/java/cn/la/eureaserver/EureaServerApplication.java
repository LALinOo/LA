package cn.la.eureaserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EureaServerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EureaServerApplication.class, args);
		new SpringApplicationBuilder(EureaServerApplication.class).web(true).run(args);
	}
}
