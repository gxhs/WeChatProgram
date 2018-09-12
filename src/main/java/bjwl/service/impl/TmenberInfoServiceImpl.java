package bjwl.service.impl;

import bjwl.dao.TmenberinfoMapper;
import bjwl.pojo.Example.TmenberinfoExample;
import bjwl.pojo.Tmenberinfo;
import bjwl.service.TmenberInfoService;
import org.apache.poi.ss.formula.functions.T;
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
        TmenberinfoExample tmenberinfoExample=new TmenberinfoExample();
        TmenberinfoExample.Criteria criteria =tmenberinfoExample.createCriteria();
        criteria.andMemnameNotEqualTo(memName);
        return tmenberinfoMapper.selectIdBymemName(memName);
    }

}
