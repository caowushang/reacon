package com.xhx.reacon.common.base;

import lombok.Data;

@Data
public class BaseResponse<T> {
    private Boolean isSuccess;
    private T result;
    private String errorMsg;
    private Integer errorCode;

    public static BaseResponseBuild.FailResponse newFailResponse() {
        return new BaseResponseBuild.FailResponse();
    }

    public static BaseResponseBuild.SuccessResponse newSuccessResponse() {
        return new BaseResponseBuild.SuccessResponse();
    }


    BaseResponse(T result) {
        this.result = result;
    }
    public BaseResponse() {
        this(null);
    }

}
