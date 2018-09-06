package bjwl.service.impl;


import bjwl.dao.TcommitMapper;
import bjwl.pojo.Example.TcommitExample;
import bjwl.pojo.Tcommit;
import bjwl.service.TCommitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCommitServiceImpl implements TCommitService {

    @Autowired
    TcommitMapper tcommitMapper;

    @Override
    public void insert(Tcommit tcommit) {
        tcommitMapper.insert(tcommit);
    }

    @Override
    public List<Tcommit> selectbyTvideoId(int id) {
        TcommitExample tcommitExample =new  TcommitExample();
        TcommitExample.Criteria criteria=tcommitExample.createCriteria();
        criteria.andIdEqualTo(id);
        return tcommitMapper.selectByExample(tcommitExample);
    }
}
