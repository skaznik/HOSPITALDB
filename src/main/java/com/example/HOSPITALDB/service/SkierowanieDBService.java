package com.example.HOSPITALDB.service;

import TestController.NotFoundException;
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
    public SkierowanieDoLekarza getSkierowanie(Integer id) throws NotFoundException {
        return dao.findById(id)
                .orElseThrow(() ->new TestController.NotFoundException());
    }

    @Override
    public void deleteSkierowanie(Integer id) throws NotFoundException {
    SkierowanieDoLekarza skierowanieDoLekarza = getSkierowanie(id);
        dao.delete(skierowanieDoLekarza);
    }

    @Override
    public SkierowanieDoLekarza createSkierowanie(SkierowanieDoLekarza skierowanie) {
        skierowanie.setId(null);
        return dao.save(skierowanie);
    }

    @Override
    public SkierowanieDoLekarza updateSkierowanie(SkierowanieDoLekarza skierowanie) throws NotFoundException {
        SkierowanieDoLekarza skierowanieDoLekarza = getSkierowanie(skierowanie.getId());
        skierowanieDoLekarza.setLekarz(skierowanie.getLekarz());
        skierowanieDoLekarza.setPacjent(skierowanie.getPacjent());
        skierowanieDoLekarza.setTermin(skierowanie.getTermin());
        return dao.save(skierowanieDoLekarza);
    }
}
