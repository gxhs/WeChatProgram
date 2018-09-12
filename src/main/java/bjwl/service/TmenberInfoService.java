package bjwl.service;

import bjwl.pojo.Tmenberinfo;

public interface TmenberInfoService {

    void insert(Tmenberinfo tmenberinfo);
    void updateBynotNull(Tmenberinfo tmenberinfo);
    int  selectCountUser(String memName);
    Tmenberinfo selectIdBymemName(String memName);
}