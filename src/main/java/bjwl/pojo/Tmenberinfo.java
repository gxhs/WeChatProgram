package bjwl.pojo;

import java.util.Date;

public class Tmenberinfo {
    private Integer memid;

    private String memname;

    private String phonenum;

    private String wxno;

    private Date regtm;

    private Integer recomid;

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