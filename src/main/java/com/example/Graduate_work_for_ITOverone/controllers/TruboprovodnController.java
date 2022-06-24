package com.example.Graduate_work_for_ITOverone.controllers;

import com.example.Graduate_work_for_ITOverone.models.TruboprovodnArmatura;
import com.example.Graduate_work_for_ITOverone.repos.TruboprovodnArmaturaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TruboprovodnController {
    @Autowired
    private TruboprovodnArmaturaRepo truboprovodnArmaturaRepo;
    @GetMapping("/truboprovodn")
    public String truboprovodn(Model model){
        Iterable<TruboprovodnArmatura> truboprovodnArmaturas = truboprovodnArmaturaRepo.findAll();
        model.addAttribute("truboprovodn", truboprovodnArmaturas);
        return "truboprovodn";
    }
    @GetMapping("/truboprovodn/trbAdd")
    public String trbAdd(Model model){
        return "trbAdd";
    }
    @PostMapping("/truboprovodn/trbAdd")
    public String nrjPostAdd(@RequestParam String name){
        TruboprovodnArmatura truboprovodnArmatura =new TruboprovodnArmatura(name);
        truboprovodnArmaturaRepo.save(truboprovodnArmatura);
        return "redirect:/truboprovodn";
    }
}
