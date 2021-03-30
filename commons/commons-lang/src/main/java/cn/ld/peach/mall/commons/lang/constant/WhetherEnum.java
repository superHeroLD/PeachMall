package cn.ld.peach.mall.commons.lang.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 是否枚举类
 * 原谅我的翻译，只能想到这个了
 *
 * @author lidong
 * @date 2021/3/30
 */
@Getter
@AllArgsConstructor
public enum WhetherEnum {

    /**
     * 是否枚举类
     */
    YES(1, true),
    NO(0, false);

    final int code;

    final boolean value;
}
