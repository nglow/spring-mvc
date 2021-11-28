package com.example.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Slf4j
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @GetMapping("/log-test")
    public String logTest() {
        String name = "spring";

        System.out.println("name = " + name);

        log.trace("name = {}", name);
        log.debug("name = {}", name);
        log.info("name = {}", name);
        log.warn("name = {}", name);
        log.error("name = {}", name);
        return "ok";
    }
}
