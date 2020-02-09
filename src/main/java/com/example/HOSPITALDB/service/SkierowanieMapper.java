package com.example.HOSPITALDB.service;

import com.example.HOSPITALDB.dto.SkierowanieDoLekarzaDTO;
import com.example.HOSPITALDB.model.SkierowanieDoLekarza;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SkierowanieMapper {
    SkierowanieDoLekarzaDTO toDTO(SkierowanieDoLekarza skierowanieDoLekarza);

    SkierowanieDoLekarza toDB(SkierowanieDoLekarzaDTO skierowanieDoLekarzaDTO);

    List<SkierowanieDoLekarzaDTO> toDTO(List<SkierowanieDoLekarza> skierowanieDoLekarzaList);

}
