package com.c0bra.animation.mapper;

import com.c0bra.animation.model.Anime;
import com.c0bra.animation.model.AnimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnimeMapper {
    long countByExample(AnimeExample example);

    int deleteByExample(AnimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Anime record);

    int insertSelective(Anime record);

    List<Anime> selectByExample(AnimeExample example);

    Anime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Anime record, @Param("example") AnimeExample example);

    int updateByExample(@Param("record") Anime record, @Param("example") AnimeExample example);

    int updateByPrimaryKeySelective(Anime record);

    int updateByPrimaryKey(Anime record);
}