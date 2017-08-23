package club.knowyou.storys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JIUN on 2017/8/23.
 */
@Controller
public class IndexController {
    @RequestMapping("index")
    public String index(){
        return "/home/index";
    }
}
