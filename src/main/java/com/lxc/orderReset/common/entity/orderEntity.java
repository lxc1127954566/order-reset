package com.lxc.orderReset.common.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Table(name = "ORDCT_ORDER")
public class orderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long userId;
    private String domainName;
    private String orderUUID;
    private String resourceUUID;
    private String resourceType;
    private Date createTime;
    private Date orderExpireTime;
    private String orderStatus;
    private String orderSubStatus;
    private BigDecimal origPrice;
    private BigDecimal payPrice;


}
