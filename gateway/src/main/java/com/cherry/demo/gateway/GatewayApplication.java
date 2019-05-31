package com.cherry.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        //配置了一个 id 为 path_route 的路由
        //当访问地址http://localhost:8080/about时会自动转发到地址：http://www.ityouknow.com/about和上面的转发效果一样，只是这里转发的是以项目地址/about格式的请求地址。
        return builder.routes()
                .route("path_route",r -> r.path("/about").uri("http://ityouknow.com"))
                .build();
    }
}
