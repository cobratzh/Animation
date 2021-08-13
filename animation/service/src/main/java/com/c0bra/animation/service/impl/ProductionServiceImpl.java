package com.c0bra.animation.service.impl;

import com.c0bra.animation.mapper.ProductionMapper;
import com.c0bra.animation.model.Production;
import com.c0bra.animation.model.ProductionExample;
import com.c0bra.animation.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductionServiceImpl implements ProductionService {
    @Autowired
    private ProductionMapper productionMapper;

    @Override
    public List<Production> listAll() {
        return productionMapper.selectByExample(new ProductionExample());
    }

    @Override
    public Production get(Integer id) {
        return productionMapper.selectByPrimaryKey(id);
    }


    @Override
    public List<Production> select(List<Integer> ids) {
        ProductionExample example = new ProductionExample();
        example.createCriteria().andProductionIdIn(ids);
        return productionMapper.selectByExample(example);
    }

    @Override
    public int delete(List<Integer> ids) {
        ProductionExample example = new ProductionExample();
        example.createCriteria().andProductionIdIn(ids);
        return  productionMapper.deleteByExample(example);
    }

    @Override
    public int update(Integer id, Production production) {
        production.setProductionId(id);
        return productionMapper.updateByPrimaryKeySelective(production);
    }

    @Override
    public int create(Production production ) {
        return  productionMapper.insertSelective(production);
    }
}
