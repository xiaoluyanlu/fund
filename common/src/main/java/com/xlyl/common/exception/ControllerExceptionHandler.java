package com.xlyl.common.exception;

import com.xlyl.common.resp.CommonResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释 统一处理捕获到的异常
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    /**
     * 所有的未知异常都按指定的样子抛出去
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody//返回结果是json,注解将结果转换成json
    public CommonResp exceptionHandler(Exception e) {
        CommonResp commonResp = new CommonResp();
        LOG.error("系统异常: ", e);
        commonResp.setSuccess(false);
        commonResp.setMessage("系统出现异常,请联系系统管理员");
        return commonResp;
    }

    /**
     * 返回前端统一的业务异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = CompaniesException.class)
    @ResponseBody//返回结果是json,注解将结果转换成json
    public CommonResp exceptionHandler(CompaniesException e) {
        CommonResp commonResp = new CommonResp();
        LOG.error("业务异常: {}", e.getE().getDesc());
        commonResp.setSuccess(false);
        commonResp.setMessage(e.getE().getDesc());
        return commonResp;
    }

    /**
     * 捕获校验框架的异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = BindException.class)
    @ResponseBody//返回结果是json,注解将结果转换成json
    public CommonResp exceptionHandler(BindException e) {
        CommonResp commonResp = new CommonResp();
        LOG.error("校验框架异常: {}", e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
        commonResp.setSuccess(false);
        commonResp.setMessage(e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
        return commonResp;
    }

}
