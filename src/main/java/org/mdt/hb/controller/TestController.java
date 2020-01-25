package org.mdt.hb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * TestController
 */
@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping(value = "")
    public String test() {
        return "{\"message\": \"hello\"}";
    }

}