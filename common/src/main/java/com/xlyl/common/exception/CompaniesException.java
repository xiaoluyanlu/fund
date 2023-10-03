package com.xlyl.common.exception;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释  手动抛出异常
 */
public class CompaniesException extends RuntimeException {

    private CompaniesExceptionEnum e;

    public CompaniesException(CompaniesExceptionEnum e) {
        this.e = e;
    }

    public CompaniesExceptionEnum getE() {
        return e;
    }

    public void setE(CompaniesExceptionEnum e) {
        this.e = e;
    }

    /**
     * 不写入堆栈信息，提高性能
     */
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
