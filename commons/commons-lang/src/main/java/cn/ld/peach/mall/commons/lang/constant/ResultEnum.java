package cn.ld.peach.mall.commons.lang.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author lidong
 * @date 2021/3/27
 */
@AllArgsConstructor
public enum ResultEnum {
    /**
     * 封装了一些http返回码
     */
    SUCCESS(200, "success"),
    BAD_REQUEST(400, "bad request"),
    INNER_ERROR(500, "server error"),
    BAD_GATEWAY(502, "bad gateway");

    @Getter
    private final int code;

    @Getter
    private final String msg;
}
