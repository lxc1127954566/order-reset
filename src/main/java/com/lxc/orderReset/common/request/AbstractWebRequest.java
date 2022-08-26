package com.lxc.orderReset.common.request;

import org.springframework.http.HttpMethod;

public class AbstractWebRequest {

    private Long OperatorUserId;

    public Long getOperatorUserId() {
        return OperatorUserId;
    }

    public void setOperatorUserId(Long operatorUserId) {
        OperatorUserId = operatorUserId;
    }

    public void setHTTPMethod(HttpMethod httpMethod){

    }
}
