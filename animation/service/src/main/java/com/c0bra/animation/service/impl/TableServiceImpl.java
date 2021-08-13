package com.c0bra.animation.service.impl;

import com.c0bra.animation.mapper.TableMapper;
import com.c0bra.animation.model.Table;
import com.c0bra.animation.model.TableExample;
import com.c0bra.animation.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TableServiceImpl implements TableService {

    @Autowired
    private TableMapper tableMapper;

    @Override
    public List<Table> listAll() {
        return tableMapper.selectByExample(new TableExample());
    }

    @Override
    public Table get(Integer id) {
        return tableMapper.selectByPrimaryKey(id);
    }


    @Override
    public List<Table> select(List<Integer> ids) {
        TableExample example = new TableExample();
        example.createCriteria().andAnimeIdIn(ids);
        return tableMapper.selectByExample(example);
    }

    @Override
    public int delete(List<Integer> ids) {
        TableExample example = new TableExample();
        example.createCriteria().andAnimeIdIn(ids);
        return  tableMapper.deleteByExample(example);
    }

    @Override
    public int update(Integer id ,Table table) {
         table.setAnimeId(id);
        return tableMapper.updateByPrimaryKeySelective(table);
    }

    @Override
    public int create(Table table) {
        return  tableMapper.insertSelective(table);
    }
}
