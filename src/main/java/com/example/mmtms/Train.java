package com.example.mmtms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Train {
    @GetMapping("/Train")
    public String getData() {return "please ebook Train at 30% discount" ; }
}
