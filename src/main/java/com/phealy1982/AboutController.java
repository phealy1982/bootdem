package com.phealy1982;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {
	@RequestMapping("/about")
    String info() {
        return "this is what we are about";
    }
}
