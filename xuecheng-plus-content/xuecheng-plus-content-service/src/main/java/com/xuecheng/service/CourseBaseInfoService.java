package com.xuecheng.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.model.dto.QueryCourseParamsDto;
import com.xuecheng.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;

public interface CourseBaseInfoService {
    //课程查询
    public PageResult<CourseBase> queryCourseBaseList(PageParams params,QueryCourseParamsDto queryCourseParamsDto);
}
