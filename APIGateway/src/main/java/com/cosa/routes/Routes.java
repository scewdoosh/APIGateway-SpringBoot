package com.cosa.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Routes {
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes().route("application1", r -> r.path("/get-info").uri("lb://APPLICATION1"))
				.route("application2", r -> r.path("/get-data").uri("lb://APPLICATION2")).build();
	}
}
