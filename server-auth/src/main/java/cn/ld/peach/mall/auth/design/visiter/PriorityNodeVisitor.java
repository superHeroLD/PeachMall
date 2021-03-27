package cn.ld.peach.mall.auth.design.visiter;

import cn.ld.peach.mall.auth.domain.PriorityNode;

/**
 * 权限树节点的访问者接口
 *
 * @author lidong
 * @date 2021/3/27
 */
public interface PriorityNodeVisitor {

    /**
     * 访问者方法
     *
     * @param priorityNode 权限节点
     */
    void visit(PriorityNode priorityNode);
}
