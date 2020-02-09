package com.example.HOSPITALDB.service;

import TestController.NotFoundException;
import com.example.HOSPITALDB.dto.SkierowanieDoLekarzaDTO;
import com.example.HOSPITALDB.model.SkierowanieDoLekarza;

import java.util.Collection;

public interface SkierowanieService {

    Collection<SkierowanieDoLekarzaDTO> listSkierowanie();
    SkierowanieDoLekarzaDTO getSkierowanie(Integer id) throws NotFoundException;
    void deleteSkierowanie(Integer id) throws NotFoundException;
    SkierowanieDoLekarzaDTO createSkierowanie(SkierowanieDoLekarzaDTO skierowanie);
    SkierowanieDoLekarzaDTO updateSkierowanie(SkierowanieDoLekarzaDTO skierowanie) throws NotFoundException;




}