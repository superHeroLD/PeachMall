package cn.ld.peach.mall.goods.domain.goods;


import cn.ld.peach.mall.commons.lang.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 商品属性DO
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class CommodityProperty extends BaseDO {

    /**
     * 属性名称
     */
    private String propertyName;

    /**
     * 属性描述
     */
    private String propertyDesc;

    /**
     * 输入方式，1：多选，2：输入
     */
    private Long inputType;

    /**
     * 可选值范围，如果输入方式是可选，那么需要提供一些供选择的值范围
     */
    private String inputValues;
}
