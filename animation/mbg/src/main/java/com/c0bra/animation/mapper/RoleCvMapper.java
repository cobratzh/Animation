package com.c0bra.animation.mapper;

import com.c0bra.animation.model.RoleCv;
import com.c0bra.animation.model.RoleCvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleCvMapper {
    long countByExample(RoleCvExample example);

    int deleteByExample(RoleCvExample example);

    int deleteByPrimaryKey(@Param("animeId") Integer animeId, @Param("cvId") Integer cvId);

    int insert(RoleCv record);

    int insertSelective(RoleCv record);

    List<RoleCv> selectByExample(RoleCvExample example);

    RoleCv selectByPrimaryKey(@Param("animeId") Integer animeId, @Param("cvId") Integer cvId);

    int updateByExampleSelective(@Param("record") RoleCv record, @Param("example") RoleCvExample example);

    int updateByExample(@Param("record") RoleCv record, @Param("example") RoleCvExample example);

    int updateByPrimaryKeySelective(RoleCv record);

    int updateByPrimaryKey(RoleCv record);
}