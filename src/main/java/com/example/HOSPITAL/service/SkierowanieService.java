package com.example.HOSPITAL.service;

import com.example.HOSPITAL.model.SkierowanieDoLekarza;

import java.util.Collection;
import java.util.List;

public interface SkierowanieService {

    Collection<SkierowanieDoLekarza> listSkierowanie();
    SkierowanieDoLekarza getSkierowanie(Integer id);
    void deleteSkierowanie(Integer id);
    SkierowanieDoLekarza createSkierowanie(SkierowanieDoLekarza skierowanie);
    SkierowanieDoLekarza updateSkierowanie(SkierowanieDoLekarza skierowanie);




}