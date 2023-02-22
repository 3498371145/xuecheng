package com.xuecheng.model.dto;

import com.xuecheng.model.po.CourseCategory;
import lombok.Data;

import java.util.List;
@Data
public class CourseCategoryTreeDto extends CourseCategory {
    List childrenTreeNodes;
}
