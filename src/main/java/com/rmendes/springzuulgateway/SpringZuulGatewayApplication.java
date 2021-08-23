package com.rmendes.springzuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulGatewayApplication.class, args);
	}

}
