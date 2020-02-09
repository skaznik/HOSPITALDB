package com.example.HOSPITAL.service;

import com.example.HOSPITAL.model.SkierowanieDoLekarza;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SkierowanieDBService implements SkierowanieService{
    @Override
    public Collection<SkierowanieDoLekarza> listSkierowanie() {
        return null;
    }

    @Override
    public SkierowanieDoLekarza getSkierowanie(Integer id) {
        return null;
    }

    @Override
    public void deleteSkierowanie(Integer id) {

    }

    @Override
    public SkierowanieDoLekarza createSkierowanie(SkierowanieDoLekarza skierowanie) {
        return null;
    }

    @Override
    public SkierowanieDoLekarza updateSkierowanie(SkierowanieDoLekarza skierowanie) {
        return null;
    }
}
