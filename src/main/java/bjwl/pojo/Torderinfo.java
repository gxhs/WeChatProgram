package bjwl.pojo;

import bjwl.pojo.Key.TorderinfoKey;

import java.util.Date;

public class Torderinfo extends TorderinfoKey {
    private Date ordertm;       //订购时间

    private Float fee;          //交易金额

    public Date getOrdertm() {
        return ordertm;
    }

    public void setOrdertm(Date ordertm) {
        this.ordertm = ordertm;
    }

    public Float getFee() {
        return fee;
    }

    public void setFee(Float fee) {
        this.fee = fee;
    }
}