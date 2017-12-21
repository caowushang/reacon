package com.xhx.reacon.api.controller;

import com.xhx.reacon.common.vo.TestVO;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

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
        return testVO;
    }
}
