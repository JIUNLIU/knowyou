package club.knowyou.storys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by JIUN on 2017/8/22.
 * 该类的作用是用来做框架测试
 */

@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String testController() {
        System.err.println("进来了，Spring框架配置成功");
        return "进来了";
    }
}
