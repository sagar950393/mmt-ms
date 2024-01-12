package com.example.mmtms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hotel {
    @GetMapping("/Hotel")
    public String getData() {return "please ebook Hotel at 30% discount from mmt-ms" ; }
}
