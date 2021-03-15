package com.mayaoting.springcloud.common;

public class Contant {
    /**
     * 返回值常量 成功 sussess 失败 error
     */
    public final static String SUCCESS_CODE = "success";
    public final static String ERROR_CODE = "error";

    /**
     * hystirix 服务熔断 返回Boolean标志
     */
    public final static Boolean SUCCESS_BOOLEAN_STATUS = true;
    public final static Boolean ERROR_BOOLEAN_STATUS = true;

    /**
     * hystirix 服务熔断 返回String标志
     */
    public final static String SUCCESS_STRING_STATUS = "success";;
    public final static String ERROR_STRING_STATUS = "服务熔断 生效 调用服务失败 error";
}
