package bjwl.pojo;

public class Loginstate {
    private String appid;

    private String rdSession;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getRdSession() {
        return rdSession;
    }

    public void setRdSession(String rdSession) {
        this.rdSession = rdSession == null ? null : rdSession.trim();
    }
}