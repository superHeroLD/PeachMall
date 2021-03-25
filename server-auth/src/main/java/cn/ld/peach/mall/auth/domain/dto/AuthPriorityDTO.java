package cn.ld.peach.mall.auth.domain.dto;

import lombok.Data;

import java.util.Date;

/**
 * 管理权限DTO
 *
 * @author lidong
 * @date 2021/3/25
 */
@Data
public class AuthPriorityDTO {

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

    /**
     * 权限编号
     */
    private String code;

    /**
     * 权限对应的请求URL
     */
    private String url;

    /**
     * 权限的说明备注
     */
    private String priorityComment;

    /**
     * 权限类型，1：菜单，2：其他
     */
    private Integer priorityType;

    /**
     * 父权限的主键
     */
    private Long parentId;
}
