/*package com.firsttest.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                /*.route(r -> r.path("/hello/**")
                        .filters(f -> f.hystrix(h -> h.setName("Hystrix")
                                .setFallbackUri("forward:/fallback/flask")))
                        .uri("lb://test_app_flask")
                        .id("TEST_APP_FLASK"))**

                .route(r -> r.path("/school/**")
                		.filters(f -> f.hystrix(h -> h.setName("Hystrix")
                				.setFallbackUri("forward:/fallback/school")))
                        .uri("lb://SCHOOL-SERVICE")
                        .id("SCHOOL-SERVICE"))

                .route(r -> r.path("/student/**")
                		.filters(f -> f.hystrix(h -> h.setName("Hystrix")
                				.setFallbackUri("forward:/fallback/student")))
                        .uri("lb://STUDENT-SERVICE")
                        .id("STUDENT-SERVICE"))

                .build();
    }

}

 */