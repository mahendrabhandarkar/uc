package com.uc.demod.config;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.EncodedResourceResolver;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration

public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**").addResourceLocations("file:images/");
        registry
        .addResourceHandler("/js/**")
        .addResourceLocations("/js/")
        .setCachePeriod(3600)
        .resourceChain(true)
        .addResolver(new EncodedResourceResolver())
        .addResolver(new PathResourceResolver());
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	   registry.addViewController("/home").setViewName("home");
	   registry.addViewController("/").setViewName("home");
	   registry.addViewController("/hello").setViewName("hello");
	   registry.addViewController("/login").setViewName("login");
	}
	/*
	@Override
    public void configure(HttpSecurity http) throws Exception {
       http.csrf().disable().authorizeRequests()
        .antMatchers("/").permitAll()
        .antMatchers(HttpMethod.POST,"/newuser").permitAll()
        .antMatchers(HttpMethod.POST, "/login").permitAll()
        .antMatchers(HttpMethod.POST,"/newuser/*").permitAll()
        .antMatchers(HttpMethod.GET,"/master/*").permitAll()
         .antMatchers(HttpMethod.GET,"/exploreCourse").permitAll()
        .anyRequest().authenticated()
    }
    */
}
