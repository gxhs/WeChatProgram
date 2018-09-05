package bjwl.service.impl;

import bjwl.dao.TorderinfoMapper;
import bjwl.pojo.Example.TorderinfoExample;
import bjwl.pojo.Torderinfo;
import bjwl.service.TorderInfoService;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorderInfoServiceImpl implements TorderInfoService {

    @Autowired
    TorderinfoMapper torderinfoMapper;

    @Override
    public void insert(Torderinfo torderinfo) {
        torderinfoMapper.insert(torderinfo);
    }

    @Override
    public List<Torderinfo> selectById(int UserId) {
        TorderinfoExample torderinfoExample=new TorderinfoExample();
        TorderinfoExample.Criteria criteria=torderinfoExample.createCriteria();
        criteria.andIdEqualTo(UserId);
        return torderinfoMapper.selectByExample(torderinfoExample);
    }
}
