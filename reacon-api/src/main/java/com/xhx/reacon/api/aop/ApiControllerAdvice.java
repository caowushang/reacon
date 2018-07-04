package com.xhx.reacon.api.aop;

import com.xhx.reacon.common.base.BaseResponse;
import com.xhx.reacon.common.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApiControllerAdvice {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public BaseResponse handleBusinessException(BusinessException businessException) {
        logger.warn(businessException.getMessage() + " business exception from:" + businessException.toString());
        return BaseResponse.newFailResponse()
                .errorCode(businessException.getCode())
                .errorMsg(businessException.getMessage())
                .build();
    }

/*    @ExceptionHandler(SystemException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public BaseResponse handleSystemException(SystemException systemException) {
        logger.error(systemException.getMessage(), systemException);
        return BaseResponse.newFailResponse()
                .errorCode(systemException.getCode())
                .errorMsg(systemException.getMessage())
                .build();
    }
*/

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public BaseResponse handleRuntimeException(RuntimeException runtimeException) {
        logger.error(runtimeException.getMessage(), runtimeException);
        return BaseResponse.newFailResponse()
                //todo
                .errorCode(1000)
                .errorMsg("System Error")
                .build();
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public BaseResponse handleInvalidFormatException(HttpMessageNotReadableException httpMessageNotReadableException) {
        logger.error(httpMessageNotReadableException.getMessage(), httpMessageNotReadableException);
        return BaseResponse.newFailResponse()
                //todo
                .errorCode(1001)
                .errorMsg("BAD_PARAMS")
                .build();
    }
/*
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public BaseResponse handleVaildateException(RuntimeException runtimeException) {
        logger.error(runtimeException.getMessage(), runtimeException);
        return BaseResponse.newFailResponse()
                //todo
                .errorCode(1000)
                .errorMsg("System Error")
                .build();
    }
    */
}
