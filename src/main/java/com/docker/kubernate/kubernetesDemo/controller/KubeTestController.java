package com.docker.kubernate.kubernetesDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="test")
public class KubeTestController {

	@GetMapping
	public String get() {
		return "Hellow Kubernates is running";
		
	}
	
}
