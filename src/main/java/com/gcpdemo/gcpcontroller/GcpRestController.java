package com.gcpdemo.gcpcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GcpRestController {
	@GetMapping(value="/hello")
	public String sayHello() {
		
		return "Hello World";
	}

}
