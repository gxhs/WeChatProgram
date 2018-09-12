package bjwl.service.impl;

import bjwl.dao.LoginstateMapper;
import bjwl.pojo.Example.LoginstateExample;
import bjwl.pojo.Loginstate;
import bjwl.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginstateMapper loginstateMapper;

    @Override
    public int insert(Loginstate loginstate) {

        return loginstateMapper.insert(loginstate);
    }

    @Override
    public int updateByKey(Loginstate loginstate) {
        return loginstateMapper.updateByPrimaryKey(loginstate);
    }

    @Override
    public int selectByResession(String re) {
        LoginstateExample loginstateExample=new LoginstateExample();
        LoginstateExample.Criteria criteria=loginstateExample.createCriteria();
        criteria.andRdSessionEqualTo(re);
        return loginstateMapper.countByExample(loginstateExample);
    }

    @Override
    public Loginstate selectByKey(String id) {
        return loginstateMapper.selectByPrimaryKey(id);
    }
}
