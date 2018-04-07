package com.xhx.reacon.common.request;

import lombok.Data;

import java.util.List;

@Data
public class ShowUsersRequest {
    private List<Integer> idList;
}
