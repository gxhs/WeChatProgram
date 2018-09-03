package bjwl.pojo;

import java.util.Date;

public class Tmenberinfo {
    private Integer memid;      //MEMID

    private String memname;     // 会员内容

    private String phonenum;    //手机号

    private String wxno;        //微信号

    private Date regtm;         //注册时间

    private Integer recomid;    //推荐人ID

    public Integer getMemid() {
        return memid;
    }

    public void setMemid(Integer memid) {
        this.memid = memid;
    }

    public String getMemname() {
        return memname;
    }

    public void setMemname(String memname) {
        this.memname = memname == null ? null : memname.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getWxno() {
        return wxno;
    }

    public void setWxno(String wxno) {
        this.wxno = wxno == null ? null : wxno.trim();
    }

    public Date getRegtm() {
        return regtm;
    }

    public void setRegtm(Date regtm) {
        this.regtm = regtm;
    }

    public Integer getRecomid() {
        return recomid;
    }

    public void setRecomid(Integer recomid) {
        this.recomid = recomid;
    }
}