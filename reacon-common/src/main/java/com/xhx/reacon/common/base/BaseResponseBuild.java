package com.xhx.reacon.common.base;

public class BaseResponseBuild {
    public static class FailResponse {
        private BaseResponse response;
        public FailResponse errorMsg(String errorMsg) {
            response.setErrorMsg(errorMsg);
            return this;
        }
        public FailResponse errorCode(Integer errorCode) {
            response.setErrorCode(errorCode);
            return this;
        }
        public BaseResponse build() {
            response.setIsSuccess(false);
            return response;
        }

    }

    public static class SuccessResponse {
        private BaseResponse response;
        public  <T> SuccessResponse result(T result) {
            response = new BaseResponse<>(result);
            return this;
        }
        public BaseResponse build() {
            response.setIsSuccess(true);
            return response;
        }
    }
}
