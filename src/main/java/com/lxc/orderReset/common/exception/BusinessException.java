package com.lxc.orderReset.common.exception;


import org.springframework.util.Assert;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 5075176868928135436L;
    private final String code;
    private final Object[] params;

    public BusinessException(String code, Object... params) {
        super(code);
        Assert.hasText(code);
        this.code = code;
        this.params = params;
    }
}
