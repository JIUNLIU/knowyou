package club.knowyou.storys.service;

import club.knowyou.storys.pojo.BookInfo;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JIUN on 2017/8/22.
 * 小说搜索业务层
 */
@Service
public class SearchService {


    public List<BookInfo> search(String bookName) throws Exception{
        List<BookInfo> bookInfos = this.dashubaoSearch(bookName);
        return bookInfos;
    }

    //大书包网站搜索
    //http://zn.dashubao.net/cse/search?q=斗破苍穹&s=9410583021346449776&nsid=0

    public List<BookInfo> dashubaoSearch(String bookName) throws Exception {

        List<BookInfo> bookInfos = new ArrayList<BookInfo>();
        String url = "http://zn.dashubao.net/cse/search?q=" + bookName + "&s=9410583021346449776&nsid=0";
        Connection connect = Jsoup.connect(url);
        Document doc = connect.get();
        Elements eles = doc.select(".result-item.result-game-item");
        BookInfo bookInfo = null;
        for (Element ele : eles) {
            try {
                bookInfo = new BookInfo();
                //ele 为搜索结构的每一本书

                //设置书籍地址相关
                Element picAndURL = ele.select(".result-game-item-pic-link").get(0);
                bookInfo.setBookURL(picAndURL.attr("href"));
                Element bookPic = ele.select(".result-game-item-pic-link-img").get(0);
                bookInfo.setBookPicURL(bookPic.attr("src"));

                //书籍基本信息
                Element bookBaseInfo = ele.select(".result-item-title.result-game-item-title a").get(0);
                bookInfo.setBookName(bookBaseInfo.attr("title"));
                bookInfo.setBookDesc(ele.select(".result-game-item-desc").get(0).text());

                //书籍扩展信息
                Elements bookOtherInfo = ele.select(".result-game-item-info-tag");
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        bookInfo.setBookAuthor(bookOtherInfo.get(i).text());
                    } else if (i == 1) {
                        bookInfo.setBookType(bookOtherInfo.get(i).text());
                    } else if (i == 2) {
                        bookInfo.setUpdateTime(bookOtherInfo.get(i).text());
                    }
                }
                bookInfos.add(bookInfo);
                bookInfo = null;
            }catch (Exception e){
                e.printStackTrace();
                continue;
            }

        }
        return bookInfos;
    }
}
