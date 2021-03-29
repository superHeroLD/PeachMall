package cn.ld.peach.mall.auth.domain;

import cn.ld.peach.mall.commons.lang.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author lidong
 * @date 2021/3/25
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class AuthPriority extends BaseDO {

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
