package cn.ld.peach.mall.user.domain;

import cn.ld.peach.mall.commons.lang.base.BaseDO;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 用户信息
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true, fluent = true)
public class UserInfo extends BaseDO {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 手机号
     */
    private String cellPhoneNumber;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * email
     */
    private String email;

    /**
     * 真实姓名
     */
    private String realName;
}
