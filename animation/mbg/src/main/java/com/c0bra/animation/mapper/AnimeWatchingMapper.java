package com.c0bra.animation.mapper;

import com.c0bra.animation.model.AnimeWatching;
import com.c0bra.animation.model.AnimeWatchingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnimeWatchingMapper {
    long countByExample(AnimeWatchingExample example);

    int deleteByExample(AnimeWatchingExample example);

    int deleteByPrimaryKey(Integer animeId);

    int insert(AnimeWatching record);

    int insertSelective(AnimeWatching record);

    List<AnimeWatching> selectByExample(AnimeWatchingExample example);

    AnimeWatching selectByPrimaryKey(Integer animeId);

    int updateByExampleSelective(@Param("record") AnimeWatching record, @Param("example") AnimeWatchingExample example);

    int updateByExample(@Param("record") AnimeWatching record, @Param("example") AnimeWatchingExample example);

    int updateByPrimaryKeySelective(AnimeWatching record);

    int updateByPrimaryKey(AnimeWatching record);
}