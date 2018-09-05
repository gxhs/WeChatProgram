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
        tmenberinfoMapper.insert(tmenberinfo);
    }

    @Override
    public void updateBynotNull(Tmenberinfo tmenberinfo) {
        tmenberinfoMapper.updateByPrimaryKeySelective(tmenberinfo);
    }
}
