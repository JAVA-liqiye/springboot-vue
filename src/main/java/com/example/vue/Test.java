package com.example.vue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

    @RequestMapping("/query")
    public String yemian() {
        System.out.println("进来了");
        return "addReader";
    }

}
