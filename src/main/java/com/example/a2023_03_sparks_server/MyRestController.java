package com.example.a2023_03_sparks_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    //http://localhost:8080/max?p1=5&p2=6
    @GetMapping("/max")
    public int max(int p1, int p2) {
        System.out.println("/max : p1=" + p1 + " p2=" + p2);
        return Math.max(p1,p2);
    }

    //http://localhost:8080/test
    @GetMapping("/test")
    public String testMethode() {
        System.out.println("/test");

        return "<b>HelloWorld</b>";
    }


}