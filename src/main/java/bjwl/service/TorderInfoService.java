package bjwl.service;

import bjwl.pojo.Torderinfo;

import java.util.List;

public interface TorderInfoService {

    void insert(Torderinfo torderinfo);
    List<Torderinfo> selectById(int UserId);
}
