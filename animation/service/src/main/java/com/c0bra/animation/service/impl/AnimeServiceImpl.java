package com.c0bra.animation.service.impl;


import com.c0bra.animation.mapper.AnimeMapper;
import com.c0bra.animation.model.Anime;
import com.c0bra.animation.model.AnimeExample;
import com.c0bra.animation.service.AnimeService;
import com.github.pagehelper.PageHelper;
import io.netty.util.internal.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeServiceImpl implements AnimeService {
    @Autowired
    private AnimeMapper animeMapper;

    @Override
    public List<Anime> listAll() {
        return animeMapper.selectByExample(new AnimeExample());
    }

    @Override
    public Anime get(Integer id) {
        return animeMapper.selectByPrimaryKey(id);
    }


    @Override
    public List<Anime> select(String keyword, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        AnimeExample example = new AnimeExample();
        example.setOrderByClause("sort desc");
        AnimeExample.Criteria criteria = example.createCriteria();
        if(!StringUtil.isNullOrEmpty(keyword)){
            criteria.andAnimeNameLike("%" + keyword + "%");
        }
        return animeMapper.selectByExample(example);
    }

    @Override
    public int delete(List<Integer> ids) {
        AnimeExample example = new AnimeExample();
        example.createCriteria().andIdIn(ids);
        return animeMapper.deleteByExample(example);
    }

    @Override
    public int update(Integer id, Anime anime) {
        anime.setId(id);
        return animeMapper.updateByPrimaryKeySelective(anime);
    }

    @Override
    public int create(Anime anime) {
        return animeMapper.insertSelective(anime);
    }
}
