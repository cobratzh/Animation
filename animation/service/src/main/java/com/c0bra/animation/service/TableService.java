package com.c0bra.animation.service;

import com.c0bra.animation.model.Table;

import java.util.List;

public interface TableService {

    List<Table> listAll();

    Table get(Integer id);

    List<Table> select(List<Integer> ids);

    int delete(List<Integer> ids);

    int update(Integer id,Table table);

    int create(Table table);
}
