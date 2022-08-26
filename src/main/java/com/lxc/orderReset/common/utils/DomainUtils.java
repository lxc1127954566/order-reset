package com.lxc.orderReset.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;

public class DomainUtils {
    private static final Logger logger = LoggerFactory.getLogger(DomainUtils.class);

    public static String getDomainName(ServletRequest request){
        String domainName = request.getServerName();
        if (logger.isInfoEnabled()){
            logger.info("当前请求的域名为： {}" , domainName);
        }
        return domainName;

    }
}
