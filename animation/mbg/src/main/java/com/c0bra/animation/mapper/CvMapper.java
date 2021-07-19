package com.c0bra.animation.mapper;

import com.c0bra.animation.model.Cv;
import com.c0bra.animation.model.CvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CvMapper {
    long countByExample(CvExample example);

    int deleteByExample(CvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cv record);

    int insertSelective(Cv record);

    List<Cv> selectByExample(CvExample example);

    Cv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cv record, @Param("example") CvExample example);

    int updateByExample(@Param("record") Cv record, @Param("example") CvExample example);

    int updateByPrimaryKeySelective(Cv record);

    int updateByPrimaryKey(Cv record);
}