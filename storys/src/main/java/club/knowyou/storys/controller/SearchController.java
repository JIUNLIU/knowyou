package club.knowyou.storys.controller;

import club.knowyou.storys.service.SearchService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JIUN on 2017/8/22.
 * 该类用于，小说的搜索接口
 */
@Controller
@RequestMapping("/story")
public class SearchController {

    @Autowired
    SearchService searchService;

    @RequestMapping("/search")
    public String searchBook(@Param("bookName") String bookName) throws Exception {
        searchService.search(bookName);
        return "";
    }
}
