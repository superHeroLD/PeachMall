package cn.ld.peach.mall.user.service;

/**
 * 会员中心对外提供的接口
 *
 * @author lidong
 * @date 2021/3/24
 */
public interface MemberShipFacadeService {

    /**
     * 通知会员中心用户今日第一次登陆事件
     *
     *
     * @param userAccountId userAccountId
     * @return 是否登陆
     */
    Boolean informFirstLoginDailyEvent(Long userAccountId);
}
