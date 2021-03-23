package cn.ld.peach.mall.commons.dto;

import lombok.Data;

import java.util.Date;

/**
 * 基础DTO
 *
 * @author lidong
 * @date 2021/3/23
 */
@Data
public class BaseDTO {

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
