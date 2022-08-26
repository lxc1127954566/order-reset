package com.lxc.orderReset.common.utils;

import java.util.function.Supplier;

public class AssertUtil {
    public AssertUtil(){}

    public static <X extends Throwable> void isTrue(boolean expression, Supplier<? extends X> supplier) throws X{
        if (!expression) {
            throw (X)supplier.get();
        }
    }
}
