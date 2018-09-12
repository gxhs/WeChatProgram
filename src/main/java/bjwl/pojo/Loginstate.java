package bjwl.pojo;

import java.util.Date;

public class Loginstate {
    private String appid;

    private Date updatetime;

    private String rdSession;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getRdSession() {
        return rdSession;
    }

    public void setRdSession(String rdSession) {
        this.rdSession = rdSession == null ? null : rdSession.trim();
    }
}