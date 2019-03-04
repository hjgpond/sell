package com.imooc.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class ProductForm {


    private String productId;

    /**
     * 名字.
     */
    @NotEmpty(message = "名字必填")
    private String productName;

    /**
     * 单价.
     */
    @NotNull(message = "价格必填")
    private BigDecimal productPrice;

    /**
     * 库存.
     */
    @NotNull(message = "库存必填")
    private Integer productStock;

    /**
     * 描述.
     */
    private String productDescription;

    /**
     * 小图.
     */
    private String productIcon;

    /**
     * 类目编号.
     */
    private Integer categoryType;
}
