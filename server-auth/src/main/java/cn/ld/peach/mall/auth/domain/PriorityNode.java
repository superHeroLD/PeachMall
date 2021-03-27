package cn.ld.peach.mall.auth.domain;

import cn.ld.peach.mall.auth.design.visiter.PriorityNodeVisitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 权限节点
 * <p>
 * 组合模式 + 访问者模式
 *
 * @author lidong
 * @date 2021/3/27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PriorityNode extends AuthPriority {

    /**
     * 子权限节点
     */
    private List<PriorityNode> children;

    /**
     * 接受一个权限树访问者
     *
     * @param visitor 权限树访问者
     */
    public void accept(PriorityNodeVisitor visitor) {
        visitor.visit(this);
    }
}
