package com.c0bra.animation.service.impl;

import com.c0bra.animation.mapper.CvMapper;
import com.c0bra.animation.model.Cv;
import com.c0bra.animation.model.CvExample;
import com.c0bra.animation.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CvServiceImpl implements CvService {

    @Autowired
    private CvMapper cvMapper;

    @Override
    public List<Cv> listAll() {
        return cvMapper.selectByExample(new CvExample());
    }

    @Override
    public Cv get(Integer id) {
        return cvMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Cv> select(List<Integer> ids) {
        CvExample example = new CvExample();
        example.createCriteria().andIdIn(ids);
        return cvMapper.selectByExample(example);
    }

    @Override
    public int delete(List<Integer> ids) {
        CvExample example = new CvExample();
        example.createCriteria().andIdIn(ids);
        return cvMapper.deleteByExample(example);
    }

    @Override
    public int update(Integer id, Cv cv) {
        cv.setId(id);
        return cvMapper.updateByPrimaryKeySelective(cv);
    }

    @Override
    public int create(Cv cv) {
        return cvMapper.insertSelective(cv);
    }
}
