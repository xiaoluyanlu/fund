package com.xlyl.common.util;

import cn.hutool.core.util.IdUtil;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
public class SnowUtil {

    private static long workerId=1;
    private static long datacenterId=1;

    public static long getSnowflakeNextId() {
        return IdUtil.getSnowflake(workerId, datacenterId).nextId();
    }

}
