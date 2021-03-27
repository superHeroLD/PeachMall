package cn.ld.peach.mall.commons.lang.base;

import cn.ld.peach.mall.commons.lang.constant.ResultEnum;
import lombok.Builder;
import lombok.Data;

/**
 * web controller层结果封装
 *
 * @author lidong
 * @date 2021/3/27
 */
@Builder
@Data
public class ResultT<T> {
    /**
     * 返回码
     */
    private int code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

    public ResultT<T> setData(T data) {
        this.data = data;
        return this;
    }

    @SuppressWarnings("rawtypes")
    public static ResultT result(ResultEnum resEnum) {
        return ResultT.builder().code(resEnum.getCode()).msg(resEnum.getMsg()).build();
    }

    public Boolean isSuccess() {
        return ResultEnum.SUCCESS.getCode() == code;
    }

    @SuppressWarnings("unchecked")
    public static <T> ResultT<T> successG(T data) {
        return success().setData(data);
    }

    @SuppressWarnings("rawtypes")
    public static ResultT success() {
        return result(ResultEnum.SUCCESS);
    }
}
