package com.xhx.reacon.core;

import com.xhx.reacon.core.service.UserService;
import com.xhx.reacon.domain.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ReaconCoreApplicationContext.class)
public class CoreBaseTest {
    @Autowired
    private UserService userService;

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("55555");
        user.setInfo("666666");
        userService.addNewUser(user);
    }
}
