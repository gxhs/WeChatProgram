package bjwl.pojo;

import java.util.Date;

public class Tconce {
    private Integer yhjid;//主键 自增

    private Integer memid;//会员id

    private Date sendtm;//发放时间

    private Date losetm;//失效时间

    private Boolean iflose;//是否失效

    private Integer state;//是否使用

    private Integer facevalue;//面值（一元）

    public Integer getYhjid() {
        return yhjid;
    }

    public void setYhjid(Integer yhjid) {
        this.yhjid = yhjid;
    }

    public Integer getMemid() {
        return memid;
    }

    public void setMemid(Integer memid) {
        this.memid = memid;
    }

    public Date getSendtm() {
        return sendtm;
    }

    public void setSendtm(Date sendtm) {
        this.sendtm = sendtm;
    }

    public Date getLosetm() {
        return losetm;
    }

    public void setLosetm(Date losetm) {
        this.losetm = losetm;
    }

    public Boolean getIflose() {
        return iflose;
    }

    public void setIflose(Boolean iflose) {
        this.iflose = iflose;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getFacevalue() {
        return facevalue;
    }

    public void setFacevalue(Integer facevalue) {
        this.facevalue = facevalue;
    }
}