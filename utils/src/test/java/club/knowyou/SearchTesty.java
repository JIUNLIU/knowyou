package club.knowyou;

import java.net.URLDecoder;

/**
 * Created by liuji on 2017/8/22.
 */
public class SearchTesty {

    public void testDecode() throws Exception{

    }

    public static void main(String[] args) throws Exception{
        String str = "http://zn.dashubao.net/cse/search?s=9410583021346449776&entry=1&ie=gbk&q=%B6%B7%C6%C6%B2%D4%F1%B7";
        String decode = URLDecoder.decode(str,"GBK");
        System.out.println(decode);
    }
}
