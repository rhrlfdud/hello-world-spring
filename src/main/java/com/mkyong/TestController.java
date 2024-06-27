package com.mkyong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value={"/version", "/admin/version"})
    String version() {
        return "Version : v1";
    }
}
