package com.c0bra.animation.mapper;

import com.c0bra.animation.model.Table;
import com.c0bra.animation.model.TableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableMapper {
    long countByExample(TableExample example);

    int deleteByExample(TableExample example);

    int deleteByPrimaryKey(Integer animeId);

    int insert(Table record);

    int insertSelective(Table record);

    List<Table> selectByExample(TableExample example);

    Table selectByPrimaryKey(Integer animeId);

    int updateByExampleSelective(@Param("record") Table record, @Param("example") TableExample example);

    int updateByExample(@Param("record") Table record, @Param("example") TableExample example);

    int updateByPrimaryKeySelective(Table record);

    int updateByPrimaryKey(Table record);
}