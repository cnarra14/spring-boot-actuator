package com.narra.learn.actuatordemo.controller;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeranExampleController {

	@GetMapping("/")
	public String leran(@RequestParam(value = "learn", defaultValue = "Spring Actuator") String learn) {
		return "Learn " + learn + "!!";
	}

	@GetMapping("/learn")
	public String delay(@RequestParam(value = "delay", defaultValue = "0") Integer delay) throws InterruptedException, NoSuchAlgorithmException {
		
		if (delay == 0) {
			Random random = SecureRandom.getInstanceStrong();
			delay = random.nextInt(10);
			
			delay=10;
		}

		TimeUnit.SECONDS.sleep(delay);
		return "Learn Spring Actuator. Delay :"+delay;
	}

}
