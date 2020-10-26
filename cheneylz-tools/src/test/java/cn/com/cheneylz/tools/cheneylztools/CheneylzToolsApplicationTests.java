package cn.com.cheneylz.tools.cheneylztools;

import cn.com.cheneylz.tools.cheneylztools.entity.Lunch;
import cn.com.cheneylz.tools.cheneylztools.service.LunchService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CheneylzToolsApplicationTests {
    @Autowired
    LunchService lunchService;

    @Test
    void contextLoads() {
        Lunch lunch1 = new Lunch();
        lunch1.setName("叉烧饭");
        lunchService.saveLunch(lunch1);

        Lunch lunch2 = new Lunch();
        lunch2.setName("烧鸭饭");
        lunchService.saveLunch(lunch2);
    }

}
