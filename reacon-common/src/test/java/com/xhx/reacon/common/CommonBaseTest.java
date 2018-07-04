package com.xhx.reacon.common;

import com.xhx.reacon.common.base.BaseResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ReaconCommonApplicationContext.class)
public class CommonBaseTest {
    @Test
    public void test() {
        BaseResponse response = BaseResponse.newSuccessResponse().result(1).build();
        System.out.println(response);
        BaseResponse baseResponse = new BaseResponse();
    }
}
