package Unit9_1_Iterator;

import java.util.Date;
import java.util.Objects;

public class VideoOrder {
    private int id;
    private String title;
    private String img;
    private int price;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoOrder that = (VideoOrder) o;
        return id == that.id &&
                price == that.price &&      //int型用 == 匹配
                title.equals(that.title) &&   //String用equals匹配
                img.equals(that.img) &&
                createTime.equals(that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, img, price, createTime);
    }
}
