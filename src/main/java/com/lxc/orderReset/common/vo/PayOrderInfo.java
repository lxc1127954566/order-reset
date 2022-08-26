package com.lxc.orderReset.common.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PayOrderInfo {

    private Long id;
    private Long userId;
    private String domainName;
    private String[] orderUUID;
    private String resourceUUID;
    private String resourceType;
    private Date createTime;
    private Date orderExpireTime;
    private String orderStatus;
    private String orderSubStatus;
    private BigDecimal origPrice;
    private BigDecimal payPrice;
}
