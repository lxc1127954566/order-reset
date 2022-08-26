package com.lxc.orderReset.common.request;

import com.lxc.orderReset.common.vo.PayAmountInfoVo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDealRequest extends AbstractPostRequest{

    private List<PayAmountInfoVo> payAmountInfo;

    private List<String> OrderNos;

    private String consumptionResultCallback;

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
