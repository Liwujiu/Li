package net.xdclass.online_class.domain;

import java.util.Date;

/**
 * 小滴课堂
 *
 * 视频类
 */
public class Video {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 视频标题
     */
    private String title;

    /**
     * 视频详情
     */
    private String summary;


    /**
     *视频封面图
     */
    private String coverImg;


    /**
     * 价格
     */
    private Integer price;


    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 评分
     */
    private Double point;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                ", point=" + point +
                '}';
    }
}
