package bjwl.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tvideoinfo {
    private Integer id;         //序号

    private Integer typeid;     // 类型ID

    private String videoname;       //视频名称

    private Date ontime;            //上线时间

    private String filepath;        //文件路径

    private String filename;        //文件名称

    private Float price;            //价格

    private Boolean iffree;         //是否免费

    private String staffname;       //更新人员

    private Integer clicknum;       //点击量
/* ---------------------------- */
    private int collectionNummber;
    private String time;
    private List<Tcommit> tcommitList;//评论
    private int collection;//收藏量
    private String typeName;//类型名字
    private int iscollect;//是否收藏

    public int getIscollect() {
        return iscollect;
    }

    public void setIscollect(int iscollect) {
        this.iscollect = iscollect;
    }

    public int getCollectionNummber() {
        return collectionNummber;
    }

    public void setCollectionNummber(int collectionNummber) {
        this.collectionNummber = collectionNummber;
    }

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }

    public List<Tcommit> getTcommitList() {
        return tcommitList;
    }

    public void setTcommitList(List<Tcommit> tcommitList) {
        this.tcommitList = tcommitList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    public Date getOntime() {
        return ontime;
    }

    public void setOntime(Date ontime) {
        this.ontime = ontime;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Boolean getIffree() {
        return iffree;
    }

    public void setIffree(Boolean iffree) {
        this.iffree = iffree;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}