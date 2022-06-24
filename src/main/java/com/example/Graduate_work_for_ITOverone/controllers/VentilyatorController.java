package com.example.Graduate_work_for_ITOverone.controllers;

import com.example.Graduate_work_for_ITOverone.models.VentilyatorOborudovanie;
import com.example.Graduate_work_for_ITOverone.repos.VentilyatorOborudovanieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class VentilyatorController {
    @Autowired
    private VentilyatorOborudovanieRepo ventilyatorOborudovanieRepo;
    @GetMapping("/ventilyator")
    public String ventilyator(Model model){
        Iterable<VentilyatorOborudovanie> ventilyatorOborudovanies = ventilyatorOborudovanieRepo.findAll();
        model.addAttribute("products", ventilyatorOborudovanies);
        return "ventilyator";
    }
    @GetMapping("/ventilyator/vntAdd")
    public String trbAdd(Model model){
        return "vntAdd";
    }
    @PostMapping("/ventilyator/vntAdd")
    public String nrjPostAdd(@RequestParam String name){
        VentilyatorOborudovanie ventilyatorOborudovanie =new VentilyatorOborudovanie(name);
        ventilyatorOborudovanieRepo.save(ventilyatorOborudovanie);
        return "redirect:/ventilyator";
    }
}
