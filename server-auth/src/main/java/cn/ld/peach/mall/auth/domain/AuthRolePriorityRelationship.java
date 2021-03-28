package cn.ld.peach.mall.auth.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author lidong
 * @date 2021/3/27
 */
@Data
public class AuthRolePriorityRelationship {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 权限ID
     */
    private Long priorityId;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
