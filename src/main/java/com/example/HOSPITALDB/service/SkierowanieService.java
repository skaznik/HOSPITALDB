package com.example.HOSPITALDB.service;

import TestController.NotFoundException;
import com.example.HOSPITALDB.model.SkierowanieDoLekarza;

import java.util.Collection;

public interface SkierowanieService {

    Collection<SkierowanieDoLekarza> listSkierowanie();
    SkierowanieDoLekarza getSkierowanie(Integer id) throws NotFoundException;
    void deleteSkierowanie(Integer id) throws NotFoundException;
    SkierowanieDoLekarza createSkierowanie(SkierowanieDoLekarza skierowanie);
    SkierowanieDoLekarza updateSkierowanie(SkierowanieDoLekarza skierowanie) throws NotFoundException;




}