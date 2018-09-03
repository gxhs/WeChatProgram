package bjwl.pojo;

import bjwl.pojo.Key.TcollinfoKey;

import java.util.Date;

public class Tcollinfo extends TcollinfoKey {
    private Date colltm;  //收藏时间


    public Date getColltm() {
        return colltm;
    }

    public void setColltm(Date colltm) {
        this.colltm = colltm;
    }
}