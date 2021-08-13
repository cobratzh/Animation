package com.c0bra.animation.service;

import com.c0bra.animation.model.Cv;

import java.util.List;

public interface CvService {
    List<Cv> listAll();

    Cv get(Integer id);

    List<Cv> select(List<Integer> ids);

    int delete(List<Integer> ids);

    int update(Integer id, Cv cv);

    int create(Cv cv);
}
