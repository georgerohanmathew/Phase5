package com.rohanphase4.rohanphase4aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@RequestMapping("/getname")
	public String getName()
	{
		return "I am Rohan. I work in Trivium!";
	}

}
