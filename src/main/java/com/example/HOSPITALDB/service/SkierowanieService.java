package com.example.HOSPITALDB.service;

import com.example.HOSPITALDB.model.SkierowanieDoLekarza;

import java.util.Collection;

public interface SkierowanieService {

    Collection<SkierowanieDoLekarza> listSkierowanie();
    SkierowanieDoLekarza getSkierowanie(Integer id);
    void deleteSkierowanie(Integer id);
    SkierowanieDoLekarza createSkierowanie(SkierowanieDoLekarza skierowanie);
    SkierowanieDoLekarza updateSkierowanie(SkierowanieDoLekarza skierowanie);




}