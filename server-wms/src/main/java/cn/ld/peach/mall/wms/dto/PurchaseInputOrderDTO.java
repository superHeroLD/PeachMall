package cn.ld.peach.mall.wms.dto;

import cn.ld.peach.mall.commons.domain.dto.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 采购入库单DTO
 *
 * @author lidong
 * @date 2021/3/23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PurchaseInputOrderDTO extends BaseDTO {

    /**
     * 供应商ID
     */
    private Long supplierId;

    /**
     * 预期到达时间
     */
    private Date expectArrivalTime;

    /**
     * 实际到达时间
     */
    private Date arrivalTime;

    /**
     * 采购联系人
     */
    private String purchaseContactor;

    /**
     * 采购联系人电话
     */
    private String purchaseContactPhoneNumber;

    /**
     * 采购联系人邮箱
     */
    private String purchaseContactEmail;

    /**
     * 采购入库单备注
     */
    private String comment;

    /**
     * 采购员
     */
    private String purchaser;

    /**
     * 采购入库单状态
     */
    private Integer status;
}
