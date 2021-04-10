package cn.ld.peach.mall.user.domain.dto;

import cn.ld.peach.mall.commons.lang.base.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * userInfo DTO
 *
 * @author lidong
 * @date 2021/4/10
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class UserInfoDTO extends BaseDTO {

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
