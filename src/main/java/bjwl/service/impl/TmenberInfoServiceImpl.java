package bjwl.service.impl;

import bjwl.dao.TmenberinfoMapper;
import bjwl.pojo.Tmenberinfo;
import bjwl.service.TmenberInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TmenberInfoServiceImpl implements TmenberInfoService {

    @Autowired
    TmenberinfoMapper tmenberinfoMapper;

    @Override
    public void insert(Tmenberinfo tmenberinfo) {
        tmenberinfoMapper.insertSelective(tmenberinfo);
    }

    @Override
    public void updateBynotNull(Tmenberinfo tmenberinfo) {
        tmenberinfoMapper.updateByPrimaryKeySelective(tmenberinfo);
    }

    @Override
    public int selectCountUser(String memName) {
        return tmenberinfoMapper.selectCountUser(memName);
    }

    @Override
    public Tmenberinfo selectIdBymemName(String memName) {
        return tmenberinfoMapper.selectIdBymemName(memName);
    }

}
