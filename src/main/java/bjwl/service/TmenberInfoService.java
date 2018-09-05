package bjwl.service;

import bjwl.pojo.Tmenberinfo;

public interface TmenberInfoService {
    void insert(Tmenberinfo tmenberinfo);
    void updateBynotNull(Tmenberinfo tmenberinfo);
}
