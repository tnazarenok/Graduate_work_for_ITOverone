package com.example.Graduate_work_for_ITOverone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class ContactsController {
        @GetMapping("/contacts")
        public String home(Model model){
            model.addAttribute("title", "ProfProgress");
            return "contacts";
        }
    }
