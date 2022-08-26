package com.lxc.orderReset.common.response;

import java.io.Serializable;

public class APIResponse<T> implements Serializable {

    private static final long serialVersionUID = 8891859075121706865L;
    private String code;
    private String message;
    private String requestId;
    private String innerCode;
    private int httpStatus;
    private int rowCount;
    private T data;

    public APIResponse() {
        this.httpStatus = 202;
        this.rowCount = 0;
    }

    public APIResponse(String requestId) {
        this.httpStatus = 202;
        this.rowCount = 0;
        this.requestId = requestId;
    }

    public APIResponse(String code, String message) {
        this.httpStatus = 202;
        this.rowCount = 0;
        this.code = code;
        this.message = message;
    }

    public APIResponse(String requestId, String code, String message, String innerCode, int httpStatus) {
        this(code, message);
        this.requestId = requestId;
        this.innerCode = innerCode;
        this.httpStatus = httpStatus;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getInnerCode() {
        return innerCode;
    }

    public void setInnerCode(String innerCode) {
        this.innerCode = innerCode;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
