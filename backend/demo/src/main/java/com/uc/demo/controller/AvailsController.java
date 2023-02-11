package com.uc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.uc.demo.model.Avails;
import com.uc.demo.service.AvailsService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/avails")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AvailsController {
	@Autowired
	AvailsService availsService;
	
	@RequestMapping(value="/availability", method=RequestMethod.POST)
	public Avails createAvailability(@RequestBody Avails av) {
	    return availsService.createAvailability(av);
	}
	
	@RequestMapping(value="/availability", method=RequestMethod.GET)
	public List<Avails> readEmployees() {
	    return availsService.getAvailability();
	}

	@RequestMapping(value="/availability/{availId}", method=RequestMethod.PUT)
	public Avails readEmployees(@PathVariable(value = "availId") Integer id, @RequestBody Avails availDetails) {
	    return availsService.updateAvailability(id, availDetails);
	}

	@RequestMapping(value="/availability/{availId}", method=RequestMethod.DELETE)
	public void deleteEmployees(@PathVariable(value = "availId") Integer id) {
		availsService.deleteAvailability(id);
	}
	
	@GetMapping("/getDiscount")
    public String discount() {
     //   LOGGER.info("discount service called....");
        return "added discount 15%";
    }
//  Code with WebClient refer: https://github.com/spring-guides/getting-started-guides
//	@RequestMapping(value="availability/{availId}?custId={custId}", method=RequestMethod.GET)
//	public Customer getCustomers(@PathVariable(value={"availId","custId") Integer Id)
//	{
//		
//	}

	private static final String DEMO_SERVICE = "demoService";
	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	// http://localhost:9191/actuator/health - To check api health or status of counters
	@GetMapping("/create")
	@CircuitBreaker(name=DEMO_SERVICE, fallbackMethod = "demoFallback")
	public ResponseEntity<String> create(){
		String response = restTemplate.getForObject("http://localhost:9193/books/books", String.class);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	public ResponseEntity<String> demoFallback(Exception e){
		return new ResponseEntity<String>("Books [democ] service is down", HttpStatus.OK);
	}

}