package bjwl.pojo;

import bjwl.pojo.Key.TconceKey;

import java.util.Date;

public class Tconce extends TconceKey {
    private Date sendtm;

    private Date losetm;

    private Boolean iflose;

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