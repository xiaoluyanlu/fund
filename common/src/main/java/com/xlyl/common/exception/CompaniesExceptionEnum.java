package com.xlyl.common.exception;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释
 */
public enum CompaniesExceptionEnum {

    COMPANIES_EXIST("公司已注册"),
    COMPANIES_ID_EMPTY("公司id为空"),
    COMPANIES_ID_NOT_EXIST("该公司不存在")
    ;

    private String desc;

    CompaniesExceptionEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "CompaniesExceptionEnum{" +
                "desc='" + desc + '\'' +
                "} " + super.toString();
    }
}
