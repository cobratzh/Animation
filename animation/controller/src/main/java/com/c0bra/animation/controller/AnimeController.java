package com.c0bra.animation.controller;

import com.c0bra.animation.api.CommonPage;
import com.c0bra.animation.api.CommonResult;
import com.c0bra.animation.model.Anime;
import com.c0bra.animation.service.AnimeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Api(tags = "AnimeController", value = "动画信息管理")
@RequestMapping("/Anime")
public class AnimeController {
    @Autowired
    private AnimeService animeService;

    @ApiOperation(value = "获取所有动画详细信息")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonResult list(){
        List<Anime> anime = animeService.listAll();
        return CommonResult.success(CommonPage.restPage(anime));
    }

    @ApiOperation("根据id查询动画详细信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult get(@RequestParam("id") Integer id){
        return  CommonResult.success(animeService.get(id));
    }

    @ApiOperation("根据名字查询动画详细信息")
    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public CommonResult getList(@RequestParam(value = "keyword", required = false) String keyword,
                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        List<Anime> animeList = animeService.select(keyword, pageNum, pageSize);
        return  CommonResult.success(CommonPage.restPage(animeList));
    }



    @ApiOperation("更新动画信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public CommonResult get(@PathVariable("id") Integer id,
                            @Validated @RequestBody Anime anime){
        CommonResult commonResult;
        int count = animeService.update(id, anime);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    @ApiOperation("添加动画信息")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create( @Validated @RequestBody Anime anime){
        CommonResult commonResult;
        int count = animeService.create(anime);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

    @ApiOperation("删除动画信息")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@PathVariable("ids") List<Integer> ids){
        CommonResult commonResult;
        int count = animeService.delete(ids);
        if (count == 1) {
            commonResult = CommonResult.success(count);
        } else {
            commonResult = CommonResult.failed();
        }
        return commonResult;
    }

}
