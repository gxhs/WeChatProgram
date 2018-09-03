package bjwl.pojo;

public class Tvideotype {
    private Integer typeid;         //TYPEID

    private String typename;        // 分类名称

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }
}