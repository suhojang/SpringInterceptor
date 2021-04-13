package com.jsh.interceptor.example.config;

import com.jsh.interceptor.example.interceptor.LoggerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoggerInterceptor())
                .addPathPatterns("/*")              //include path
                .excludePathPatterns("/example");   //exclude path

        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
