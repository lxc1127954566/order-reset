package com.lxc.orderReset.common.request;


import org.springframework.http.HttpMethod;

public class AbstractPostRequest extends AbstractWebRequest{

    private Long timestamp;

    private HttpMethod httpMethod;

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getTimestamp(){
        return this.timestamp;
    }

    @Override
    public void setHTTPMethod(HttpMethod httpMethod){
        this.httpMethod = httpMethod;
    }

}
