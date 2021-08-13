package com.c0bra.animation.service.impl;

import com.c0bra.animation.mapper.AnimeWatchingMapper;
import com.c0bra.animation.model.AnimeWatching;
import com.c0bra.animation.model.AnimeWatchingExample;
import com.c0bra.animation.service.WatchingService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class WatchingServiceImpl implements WatchingService {

    @Autowired
    AnimeWatchingMapper watchingMapper;

    @Override
    public List<AnimeWatching> listAll() {
        return watchingMapper.selectByExample(new AnimeWatchingExample());
    }

    @Override
    public AnimeWatching get(Integer id) {
        return watchingMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<AnimeWatching> select(List<Integer> ids) {
        AnimeWatchingExample example = new AnimeWatchingExample();
        example.createCriteria().andAnimeIdIn(ids);
        return watchingMapper.selectByExample(example);
    }

    @Override
    public int delete(List<Integer> ids) {
        AnimeWatchingExample example = new AnimeWatchingExample();
        example.createCriteria().andAnimeIdIn(ids);
        return watchingMapper.deleteByExample(example);
    }

    @Override
    public int update(Integer id, AnimeWatching animeWatching) {
        animeWatching.setAnimeId(id);
        return watchingMapper.updateByPrimaryKeySelective(animeWatching);
    }

    @Override
    public int create(AnimeWatching animeWatching) {
        return watchingMapper.insertSelective(animeWatching);
    }
}
