package cn.la.eurekaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloAppliction {
	public static void main(String[] args) {

		SpringApplication.run(HelloAppliction.class, args);
	}
}
