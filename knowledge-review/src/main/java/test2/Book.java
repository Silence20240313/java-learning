package test2;

import java.io.Serializable;

public class Book implements Serializable {
    // TODO 书籍的编号/名称/作者
    private int bNo;
    private String bName;
    private String bAuthor;

    // TODO get/set方法 有参无参构造器
    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public Book() {
    }

    public Book(int bNo, String bName, String bAuthor) {
        this.bNo = bNo;
        this.bName = bName;
        this.bAuthor = bAuthor;
    }
}
