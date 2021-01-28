package com.utour.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String index(){
        return "index";
    }
}