package com.phealy1982;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phealy1982.models.Stuff;

@RestController
public class InfoController {
	@RequestMapping("/info")
    String info() {

		
		Stuff s = new Stuff();
		
		s.setNameOfStuff("le stuff");
		
        return "App is up and running: " + s.getNameOfStuff();

    }
}