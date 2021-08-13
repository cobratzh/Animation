package com.c0bra.animation.service.impl;

import com.c0bra.animation.mapper.RoleCvMapper;
import com.c0bra.animation.model.RoleCv;
import com.c0bra.animation.model.RoleCvExample;
import com.c0bra.animation.service.RoleCvService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleCvServiceImpl implements RoleCvService {
    @Autowired
    private RoleCvMapper roleCvMapper;

    @Override
    public List<RoleCv> listAll() {
        return roleCvMapper.selectByExample(new RoleCvExample());
    }

    @Override
    public RoleCv get(Integer animeId,Integer cvId) {
        return roleCvMapper.selectByPrimaryKey(animeId, cvId);
    }


    @Override
    public List<RoleCv> select(RoleCvExample example){
        return roleCvMapper.selectByExample(example);
    }

    @Override
    public int delete(RoleCvExample example) {
        return  roleCvMapper.deleteByExample(example);
    }

    @Override
    public int update(Integer animeId, Integer cvId, RoleCv roleCv) {
        roleCv.setAnimeId(animeId);
        roleCv.setCvId(cvId);
        return roleCvMapper.updateByPrimaryKeySelective(roleCv);
    }

    @Override
    public int create(RoleCv roleCv) {
        return  roleCvMapper.insertSelective(roleCv);
    }
}
