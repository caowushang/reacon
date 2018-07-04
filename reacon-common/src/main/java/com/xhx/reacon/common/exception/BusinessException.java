package com.xhx.reacon.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class BusinessException extends Exception {

    private String errorMsg;
    private Integer code;

    public BusinessException(String errorMsg, Integer code) {
        super(errorMsg);
        this.errorMsg = errorMsg;
        this.code = code;
    }

}
