package com.uc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.bind.annotation.GetMapping;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.uc.demo.controller.AvailsController;
import com.uc.demo.service.AvailsService;

@SpringBootApplication()
//@EnableAutoConfiguration
//(scanBasePackages={"com.uc.demo", "com.uc.controller"})
//@ComponentScan(basePackageClasses = AvailsController.class)
//@ComponentScan(basePackages = {"com.uc.controller", "com.uc.service", "com.uc.repository", "com.uc.model"})
//@ComponentScan(basePackages = {"com.uc.demo","com.uc.controller", "com.uc.service"})
//@EntityScan("com.uc.model")
//@EnableJpaRepositories(basePackages = "com.uc.repository", entityManagerFactoryRef = "sessionFactory")
@Configuration
@EnableWebMvc
public class DemoApplication extends SpringBootServletInitializer {

	private static final Logger logger = LogManager.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		logger.info("UrbanClap application started---");
		logger.info("UrbanClap Info level log message");
		logger.debug("UrbanClap Debug level log message");
		logger.error("UrbanClap Error level log message");
	}
	
	@GetMapping("/courses")
    public String discount() {
     //   LOGGER.info("discount service called....");
        return "added discount 15%";
    }
	
//	@Bean(name="entityManagerFactory")
//	public LocalSessionFactoryBean sessionFactory() {
//	    LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//	    return sessionFactory;
//	}
}
