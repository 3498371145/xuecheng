package com.xuecheng.content.api;

import com.xuecheng.model.dto.CourseCategoryTreeDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Slf4j
@Api(value = "课程分类接口",tags = "课程分类接口")
public class CourseCategoryController {
    @GetMapping("course-category/tree-nodes")
    @ApiOperation("课程分类查询接口")
    public List<CourseCategoryTreeDto> queryTreeNodes(){
        return null;
    }
}
