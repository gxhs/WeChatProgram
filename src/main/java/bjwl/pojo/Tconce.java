package bjwl.pojo;

import bjwl.pojo.Key.TconceKey;

import java.util.Date;

public class Tconce extends TconceKey {
    private Date sendtm;    //发放时间

    private Date losetm;    //失效时间

    private Boolean iflose;     //是否失效

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
}