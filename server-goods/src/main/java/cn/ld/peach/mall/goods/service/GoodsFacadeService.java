package cn.ld.peach.mall.goods.service;

import cn.ld.peach.mall.goods.dto.GoodsSkuDTO;

import java.util.List;

/**
 * 商品中心对外接口
 *
 * @author lidong
 * @date 2021/3/23
 */
public interface GoodsFacadeService {

    /**
     * 根据ID查询商品SKU
     *
     * @param goodsSkuId 商品Sku ID
     * @return 商品信息
     */
    GoodsSkuDTO getGoodsSkuById(Long goodsSkuId);
}
