package com.fedex.ground.uss.appdtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test/{facility-id}")
    public void test(String facilityId) {

    }
}