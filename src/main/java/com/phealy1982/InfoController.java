package com.phealy1982;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
	@RequestMapping("/info")
    String info() {
        return "App is up and running gh";
    }
}