package com.xhx.reacon.api.controller;

import com.xhx.reacon.common.request.QueryUserInfoRequest;
import com.xhx.reacon.common.vo.TestVO;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/health")
public class SampleController {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/testJson")
    @ResponseBody
    public TestVO testJson() {
        TestVO testVO = new TestVO();
        testVO.setI(1);
        testVO.setName("lllll");
        List<Integer> idList = Lists.newArrayList();
        idList.add(1);
        idList.add(2);
        idList.add(3);
        return testVO;
    }

    @RequestMapping("/testList")
    @ResponseBody
    public QueryUserInfoRequest testList() {
        List<Long> idList = Lists.newArrayList();
        idList.add(1L);
        idList.add(2L);
        idList.add(3L);
        QueryUserInfoRequest queryUserInfoRequest = new QueryUserInfoRequest();
        queryUserInfoRequest.setIdList(idList);
        return queryUserInfoRequest;
    }



}
