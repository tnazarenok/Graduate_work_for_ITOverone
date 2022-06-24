package com.example.Graduate_work_for_ITOverone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class StoryController {
        @GetMapping("/story")
        public String story(Model model){
            model.addAttribute("title", "");
            return "story";
        }
    }
