package com.xhx.reacon.common.request;

import lombok.Data;

import javax.validation.constraints.Size;
import java.util.List;

@Data
public class QueryUserInfoRequest {
    @Size(min = 1,message = "UID不能为空！")
    private List<Long> idList;
}
