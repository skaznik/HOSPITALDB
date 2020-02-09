package com.example.HOSPITAL.controler;

import com.example.HOSPITAL.model.SkierowanieDoLekarza;
import com.example.HOSPITAL.service.SkierowanieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller

public class SkierowanieControler {

    SkierowanieService service;

    public SkierowanieControler(SkierowanieService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public String listSkierowanie(Model model) {
        model.addAttribute("skierowania", service.listSkierowanie());
        return "list-skierowanie";
    }

    @GetMapping("/{id}")
    public String getSkierowanie(@PathVariable Integer id, Model model) {
        SkierowanieDoLekarza skierowanieDoLekarza = service.getSkierowanie(id);
        model.addAttribute("skierowanie", skierowanieDoLekarza);
        return "get-skierowanie";
    }

    @GetMapping("/dodaj")
    public String dodajSkierowanie(Model model) {
        model.addAttribute("skierowanie", new SkierowanieDoLekarza());
        return "dodaj-skierowanie";
    }

    @PostMapping("/dodaj")
    public String stworzSkierowanie(@Valid @ModelAttribute SkierowanieDoLekarza skierowanieDoLekarza, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("skierowanie", skierowanieDoLekarza);
            return "dodaj-skierowanie";
        }
        service.createSkierowanie(skierowanieDoLekarza);
        return "redirect:/list";
    }

    @GetMapping("/modyfikuj/{id}")
    public String modyfikujSkierowanie(@PathVariable Integer id, Model model) {
        model.addAttribute("skierowanie", service.getSkierowanie(id));
        return "modyfikuj-skierowanie";
    }

    @PostMapping("/modyfikuj")
    public String updateSkierowanie(@Valid @ModelAttribute SkierowanieDoLekarza skierowanieDoLekarza, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("skierowanie", skierowanieDoLekarza);
            return "modyfikuj-skierowanie";
        }
        service.updateSkierowanie(skierowanieDoLekarza);
        return "redirect:/list";
//                + skierowanieDoLekarza.getId();
//        String.format("redirect:/skierowanie/%d, ", skierowanieDoLekarza)
    }

    @GetMapping("/usun/{id}")
    public String usunSkierowanie(@PathVariable Integer id) {
        service.deleteSkierowanie((id));
        return "redirect:/list";
    }

}
