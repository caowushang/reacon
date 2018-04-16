package com.xhx.reacon.common.request;

import lombok.Data;

@Data
public class SignInRequest {
    private String name;
    private String password;
}
