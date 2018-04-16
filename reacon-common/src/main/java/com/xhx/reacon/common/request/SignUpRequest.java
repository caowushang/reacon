package com.xhx.reacon.common.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SignUpRequest {

    @NotNull(message = "用户名不能为空！")
    private String name;
    @NotNull(message = "密码不能为空！")
    private String password;
    private String info;
}
