package com.c0bra.animation.service;


import com.c0bra.animation.model.AnimeWatching;

import java.util.List;

public interface WatchingService {

    List<AnimeWatching> listAll();

    AnimeWatching get(Integer id);

    List<AnimeWatching> select(List<Integer> ids);

    int delete(List<Integer> ids);

    int update(Integer id, AnimeWatching animeWatching);

    int create(AnimeWatching animeWatching);


}
