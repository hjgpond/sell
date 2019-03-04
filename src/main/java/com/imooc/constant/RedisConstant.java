package com.imooc.constant;

/**
 * redis常量
 */
public interface RedisConstant {

    //前缀
    String TOKEN_PREFIX = "token_%s";

    //过期时间
    Integer EXPIRE = 7200;//2小时
}
