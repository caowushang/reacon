package com.xhx.reacon.common.request;

import lombok.Data;

import java.util.List;

@Data
public class QueryUserInfoRequest {
    private List<Long> idList;
}
