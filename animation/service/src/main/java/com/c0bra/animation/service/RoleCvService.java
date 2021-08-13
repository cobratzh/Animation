package com.c0bra.animation.service;

import com.c0bra.animation.model.RoleCv;
import com.c0bra.animation.model.RoleCvExample;

import java.util.List;

public interface RoleCvService {

    List<RoleCv> listAll();

    RoleCv get(Integer animeId,Integer cvId);

    List<RoleCv> select(RoleCvExample example);

    int delete(RoleCvExample example);

    int update(Integer animeid, Integer cvID, RoleCv roleCv);

    int create(RoleCv roleCv);
}
