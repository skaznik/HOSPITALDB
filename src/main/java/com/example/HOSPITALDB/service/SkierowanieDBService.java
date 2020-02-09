package com.example.HOSPITALDB.service;

import TestController.NotFoundException;
import com.example.HOSPITALDB.dao.SkierowanieDoLakarzaDao;
import com.example.HOSPITALDB.dto.SkierowanieDoLekarzaDTO;
import com.example.HOSPITALDB.model.SkierowanieDoLekarza;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Primary
@Service
public class SkierowanieDBService implements SkierowanieService{
    SkierowanieDoLakarzaDao dao;
    SkierowanieMapper mapper;

    public SkierowanieDBService(SkierowanieDoLakarzaDao dao,
                                SkierowanieMapper mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }

    @Override
    public Collection<SkierowanieDoLekarzaDTO> listSkierowanie() {
        return mapper.toDTO(dao.findAll());
    }

    @Override
    public SkierowanieDoLekarzaDTO getSkierowanie(Integer id) throws NotFoundException {
        return dao.findById(id)
                .map(s -> mapper.toDTO(s))
                .orElseThrow(() ->new TestController.NotFoundException());
    }

    @Override
    public void deleteSkierowanie(Integer id) throws NotFoundException {
        dao.deleteById(getSkierowanie(id).getId());
    }

    @Override
    public SkierowanieDoLekarzaDTO createSkierowanie(SkierowanieDoLekarzaDTO skierowanie) {
        skierowanie.setId(null);
        return dao.save(skierowanie);
    }

    @Override
    public SkierowanieDoLekarzaDTO updateSkierowanie(SkierowanieDoLekarzaDTO skierowanie) throws NotFoundException {
        SkierowanieDoLekarza skierowanieDoLekarza = getSkierowanie(skierowanie.getId());
        skierowanieDoLekarza.setLekarz(skierowanie.getLekarz());
        skierowanieDoLekarza.setPacjent(skierowanie.getPacjent());
        skierowanieDoLekarza.setTermin(skierowanie.getTermin());
        return dao.save(skierowanieDoLekarza);
    }
}
