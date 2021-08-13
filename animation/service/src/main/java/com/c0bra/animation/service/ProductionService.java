package com.c0bra.animation.service;

import com.c0bra.animation.model.Production;

import java.util.List;

public interface ProductionService {
    List<Production> listAll();

    Production get(Integer id);

    List<Production> select(List<Integer> ids);

    int delete(List<Integer> ids);

    int update(Integer id, Production production);

    int create(Production production);
}
