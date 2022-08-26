package com.lxc.orderReset.cs.ctr;

import java.lang.String;
import com.lxc.orderReset.common.exception.BusinessException;
import com.lxc.orderReset.common.property.ErrorCodes;
import com.lxc.orderReset.common.request.OrderDealRequest;
import com.lxc.orderReset.common.utils.AssertUtil;
import com.lxc.orderReset.common.utils.DomainUtils;
import com.lxc.orderReset.common.utils.UserUtils;
import com.lxc.orderReset.common.vo.OrderInfoBean;
import com.lxc.orderReset.common.vo.PayOrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(value = "order")
public class OrderController {

    @Autowired
    private OrderAPIWrapper orderAPIWrapper;

    @PostMapping(value = "/payOrder")
    public void payOrder(final HttpServletRequest httpRequest, @RequestBody OrderDealRequest request){
        final String domainName = DomainUtils.getDomainName(httpRequest);
        final Long userId = UserUtils.getUserId();
        List<OrderInfoBean> orderInfoBean = orderAPIWrapper.describeOrderByOrderNos(request.getOrderNos(), userId);
        AssertUtil.isTrue(orderInfoBean != null || orderInfoBean.size() == request.getOrderNos().size(),
                () -> new BusinessException(ErrorCodes.ORDER_STATUS_IS_FAIL));
        BigDecimal totalAmount = BigDecimal.valueOf(0);
        for (OrderInfoBean order : orderInfoBean){
            totalAmount = totalAmount.add(order.getPayPrice());
        }
        List<String> orderUUIDs = request.getOrderNos();
        PayOrderInfo payOrderInfo = new PayOrderInfo();
        payOrderInfo.setOrderUUID(orderUUIDs.toArray(new String[orderUUIDs.size()]));
        payOrderInfo.setOrderStatus(request.getOrderStatus());
        payOrderInfo.setOrderExpireTime(request.getOrderExpireTime());
        payOrderInfo.setCreateTime(request.getCreateTime());


    }
}
