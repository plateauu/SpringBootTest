
package com.plateauu.springboot;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World! <br> Witaj Piotrze!";
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}