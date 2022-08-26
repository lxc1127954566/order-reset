package com.lxc.orderReset.common.Enum;




public enum PayEnum implements InitialEnum{

    BALANCE_PAY("BALANCEPAY_CONSUMPT","余额支付"),
    DEBT_PAY("DEBTPAY_CONSUMPT","欠费支付"),
    ALI_PAY("ALIPAY_CONSUMPT","支付宝支付"),
    WX_PAY("WXPAY_CONSUMPT","微信支付");

    private String code;
    private String label;

    PayEnum(String code, String label) {
        this.code = code;
        this.label = label;
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getLabel() {
        return null;
    }
}
