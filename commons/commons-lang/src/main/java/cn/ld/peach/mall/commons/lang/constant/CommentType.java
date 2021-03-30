package cn.ld.peach.mall.commons.lang.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 评论类型
 * 1：好评，总分是4分以上；2：中评，3分；3：差评，1~2分
 *
 * @author lidong
 * @date 2021/3/30
 */
@Getter
@AllArgsConstructor
public enum CommentType {
    /**
     * 评论类型
     */
    GOOD(1, "好评"),
    MEDIUM(2, "中评"),
    BAD(3, "差评");

    private final int code;

    private final String desc;

    /**
     * 根据评价分数获取评论类型
     *
     * @param totalScore 总分
     * @return 评论类型
     */
    public static CommentType getCommentTypeByScore(int totalScore) {
        if (totalScore >= 4) {
            return GOOD;
        } else if (totalScore == 3) {
            return MEDIUM;
        }

        return BAD;
    }
}
