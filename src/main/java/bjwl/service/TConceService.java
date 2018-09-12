package bjwl.service;

import bjwl.pojo.Tconce;

import java.util.List;

public interface TConceService {

    List<Tconce> selectTconecByUserID(int UserID);
    int addTconecByUserID(Tconce tconce);
}
