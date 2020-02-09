package com.example.HOSPITALDB.service;

import com.example.HOSPITALDB.dao.SkierowanieDoLakarzaDao;
import com.example.HOSPITALDB.model.SkierowanieDoLekarza;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
@Primary
@Service
public class SkierowanieDBService implements SkierowanieService{
    SkierowanieDoLakarzaDao dao;
    public SkierowanieDBService(SkierowanieDoLakarzaDao dao) {
        this.dao = dao;
    }

    @Override
    public Collection<SkierowanieDoLekarza> listSkierowanie() {
        return dao.findAll();
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
