package com.example.HOSPITALDB.controler;

import TestController.NotFoundException;
import com.example.HOSPITALDB.dto.SkierowanieDoLekarzaDTO;
import com.example.HOSPITALDB.service.SkierowanieService;
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
    public String getSkierowanie(@PathVariable Integer id, Model model) throws NotFoundException {
        SkierowanieDoLekarzaDTO skierowanieDoLekarza = service.getSkierowanie(id);
        model.addAttribute("skierowanie", skierowanieDoLekarza);
        return "get-skierowanie";
    }

    @GetMapping("/dodaj")
    public String dodajSkierowanie(Model model) {
        model.addAttribute("skierowanie", new SkierowanieDoLekarzaDTO());
        return "dodaj-skierowanie";
    }

    @PostMapping("/dodaj")
    public String stworzSkierowanie(@Valid @ModelAttribute SkierowanieDoLekarzaDTO skierowanieDoLekarza, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("skierowanie", skierowanieDoLekarza);
            return "dodaj-skierowanie";
        }
        service.createSkierowanie(skierowanieDoLekarza);
        return "redirect:/list";
    }

    @GetMapping("/modyfikuj/{id}")
    public String modyfikujSkierowanie(@PathVariable Integer id, Model model) throws NotFoundException {
        model.addAttribute("skierowanie", service.getSkierowanie(id));
        return "modyfikuj-skierowanie";
    }

    @PostMapping("/modyfikuj")
    public String updateSkierowanie(@Valid @ModelAttribute SkierowanieDoLekarzaDTO skierowanieDoLekarza, BindingResult bindingResult, Model model) throws NotFoundException {
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
    public String usunSkierowanie(@PathVariable Integer id) throws NotFoundException {
        service.deleteSkierowanie((id));
        return "redirect:/list";
    }

}
