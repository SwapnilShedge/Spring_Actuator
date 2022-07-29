package com.cjc.in;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api")
public class Controller 
{
	@GetMapping("/check")
	public String check()
	{
		return "Actuator";
	}

}
