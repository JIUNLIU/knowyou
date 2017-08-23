package club.knowyou.storys.pojo;

/**
 * Created by liuji on 2017/8/22.
 */
public class BookInfo {

    //书籍地址相关
    private String bookPicURL;  //书籍封面图片地址
    private String bookURL;     //书籍地址

    //书籍基本信息
    private String bookName;    //书籍名称
    private String bookDesc;   //书籍简介

    //书籍扩展信息
    private String bookAuthor;  //书籍作者
    private String bookType;    //书籍类型
    private String updateTime;  //书籍更新时间

    public String getBookPicURL() {
        return bookPicURL;
    }

    public void setBookPicURL(String bookPicURL) {
        this.bookPicURL = bookPicURL;
    }

    public String getBookURL() {
        return bookURL;
    }

    public void setBookURL(String bookURL) {
        this.bookURL = bookURL;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
