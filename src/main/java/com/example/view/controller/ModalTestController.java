package com.example.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ModalTestController {

    @GetMapping("/modal")
    public String ModalTest() {
        return "modal/modalTest.html";
    }
}

