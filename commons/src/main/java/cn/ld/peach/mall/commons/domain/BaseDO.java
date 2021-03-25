package cn.ld.peach.mall.commons.domain;

import lombok.Data;

import java.util.Date;

/**
 * 基础数据模型
 *
 * @author lidong
 * @date 2021/3/25
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
