package com.c0bra.animation.service;


import com.c0bra.animation.model.Anime;

import java.util.List;

public interface AnimeService {
    List<Anime> listAll();

    Anime get(Integer id);

    List<Anime> select(String keyword, int pageNum, int pageSize);

    int delete(List<Integer> ids);

    int update(Integer id, Anime anime);

    int create(Anime anime);

}
