package com.mkyong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value={"/version", "/admin/version"}, method = RequestMethod.GET)
    String version() {
        return "Version : v1";
    }
}
