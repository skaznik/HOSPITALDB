package com.example.HOSPITAL.dao;


import com.example.HOSPITAL.model.SkierowanieDoLekarza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkierowanieDoLakarzaDao extends CrudRepository<SkierowanieDoLekarza, Integer> {
}
