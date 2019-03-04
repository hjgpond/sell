package com.imooc.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    @NotEmpty(message = "名字必填")
    private String categoryName;

    /** 类目编号. */
    @NotNull(message = "type必填")
    private Integer categoryType;
}