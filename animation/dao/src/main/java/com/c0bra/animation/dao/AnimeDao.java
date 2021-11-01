package com.c0bra.animation.dao;

import com.c0bra.animation.model.Anime;

import java.util.List;

public interface AnimeDao {
    List<Anime> listAll();

/*

    Anime get(Integer id);

    List<Anime> select(List<Integer> ids);

    int delete(List<Integer> ids);

    int update(Integer id, Anime anime);

    int create(Anime anime);
*/
}