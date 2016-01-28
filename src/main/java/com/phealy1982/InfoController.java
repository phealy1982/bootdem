package com.phealy1982;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phealy1982.models.Stuff;

@RestController
public class InfoController {
	@RequestMapping("/info/{number}")
    String info(@PathVariable(value="number") String id) {

		
		Stuff s = new Stuff();
		
		s.setNameOfStuff(id);
		
        return "App is up and running: " + s.getNameOfStuff();

    }
}