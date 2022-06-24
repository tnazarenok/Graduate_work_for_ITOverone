package com.example.Graduate_work_for_ITOverone.controllers;

import com.example.Graduate_work_for_ITOverone.models.NerjaveushcArmatura;
import com.example.Graduate_work_for_ITOverone.repos.NerjaveushcArmaturaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class NerjaveushcController {
    @Autowired
    private NerjaveushcArmaturaRepo nerjaveushcArmaturaRepo;
    @GetMapping("/nerjaveushc")
    public String nerjaveushc(Model model){
        Iterable<NerjaveushcArmatura> nerjaveuch = nerjaveushcArmaturaRepo.findAll();
        model.addAttribute("nerjaveushc", nerjaveuch);
        return "nerjaveushc";
    }
    @GetMapping("/nerjaveushc/nrjAdd")
    public String nrjAdd(Model model){
        return "nrjAdd";
    }
    @PostMapping("/nerjaveushc/nrjAdd")
    public String nrjPostAdd(@RequestParam String name){
        NerjaveushcArmatura nerjaveushcArmatura =new NerjaveushcArmatura(name);
        nerjaveushcArmaturaRepo.save(nerjaveushcArmatura);
        return "redirect:/nerjaveushc";
    }

}
