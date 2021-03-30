package cn.ld.peach.mall.commons.lang.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 评论状态
 * 1：待审核，2：已审核，3：审核不通过，4：已删除
 *
 * @author lidong
 * @date 2021/3/30
 */
@Getter
@AllArgsConstructor
public enum CommentStatus {

    /**
     * 评论状态
     */
    APPROVING(1, "待审核"),
    APPROVED(2, "已审核"),
    APPROVE_REJECTED(3, "审核不通过"),
    REMOVE(4, "已删除");

    private final int code;

    private final String desc;
}
