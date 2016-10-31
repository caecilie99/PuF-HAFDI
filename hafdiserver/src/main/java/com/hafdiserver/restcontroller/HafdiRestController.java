package com.hafdiserver.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Birgit on 31.10.2016.
 */

@RestController
public class HafdiRestController {

    private static final String greeting = "es gibt ein %s";

    @RequestMapping("/hello")
    public Hello hello(@RequestParam(value = "schiff", defaultValue = "Ruderboot") String schiff ){
        return new Hello((long) 1, String.format(greeting, schiff));

    }

}