package cn.ld.peach.mall.auth.domain;

import cn.ld.peach.mall.commons.lang.base.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author lidong
 * @date 2021/3/27
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class AuthAccountPriorityRelationship extends BaseDO {

    /**
     * 权限ID
     */
    private Long priorityId;

    /**
     * 角色ID
     */
    private Long accountId;
}
