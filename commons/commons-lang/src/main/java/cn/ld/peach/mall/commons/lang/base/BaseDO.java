package cn.ld.peach.mall.commons.lang.base;

import lombok.Data;

import java.util.Date;

/**
 * 基础数据层
 *
 * @author lidong
 * @date 2021/3/29
 */
@Data
public class BaseDO {

    /**
     * ID
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
