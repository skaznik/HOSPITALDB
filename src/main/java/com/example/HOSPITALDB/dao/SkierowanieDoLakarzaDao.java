package com.example.HOSPITALDB.dao;


import com.example.HOSPITALDB.model.SkierowanieDoLekarza;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkierowanieDoLakarzaDao extends CrudRepository<SkierowanieDoLekarza, Integer> {

    @Override
    List<SkierowanieDoLekarza> findAll();

    @Override
    List<SkierowanieDoLekarza> findAllById(Iterable<Integer> integers);

}
