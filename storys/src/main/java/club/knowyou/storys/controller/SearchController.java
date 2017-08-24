package club.knowyou.storys.controller;

import club.knowyou.storys.pojo.BookInfo;
import club.knowyou.storys.service.SearchService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by JIUN on 2017/8/22.
 * 该类用于，小说的搜索接口
 */
@Controller
@RequestMapping("/story")
public class SearchController {

    @Autowired
    SearchService searchService;

    @RequestMapping(value = "search")
    public String searchBook(String bookName, Model model) throws Exception {
        List<BookInfo> bookInfos = searchService.search(bookName);
        model.addAttribute("bookInfos", bookInfos);
        return "/home/bookInfos";
    }
}
