package com.lxc.orderReset.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.lxc.orderReset.common.property.role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class UserUtils {
    private static final Logger logger = LoggerFactory.getLogger(UserUtils.class);

    private static final ThreadLocal<JSONObject> thread = ThreadLocal.withInitial(JSONObject::new);

    public static Long getUserId(){
        Long userId = thread.get().getLong(role.ParentId);
        if (Objects.nonNull(userId)){
            return userId;
        }
        userId = thread.get().getLong(role.UserId);
        return userId;
    }
}
