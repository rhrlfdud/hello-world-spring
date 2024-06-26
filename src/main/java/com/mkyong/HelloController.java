package com.mkyong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value={"/", "/admin"})
    String hello() {
        return "Hello World, Spring Boot! \r\n Admin";
    }

    @RequestMapping(value={"/version"})
    String version() {
        return "V1";
    }

}
