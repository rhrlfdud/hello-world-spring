package com.mkyong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value={"/version", "/admin/version"})
    String version() {
        return "Version : v1";
    }
}
