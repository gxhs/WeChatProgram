package bjwl.service.impl;

import bjwl.dao.TconceMapper;
import bjwl.pojo.Example.TconceExample;
import bjwl.pojo.Tconce;
import bjwl.service.TConceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TConceServiceImpl implements TConceService {

    @Autowired
    private TconceMapper tconceMapper;

    @Override
    public List<Tconce> selectTconecByUserID(int UserID) {
        TconceExample tconceExample=new TconceExample();
        TconceExample.Criteria criteria=tconceExample.createCriteria();
        criteria.andMemidEqualTo(UserID);
        criteria.andStateEqualTo(1);
        return tconceMapper.selectByExample(tconceExample);
    }

    @Override
    public int addTconecByUserID(Tconce tconce) {
        return tconceMapper.insertSelective(tconce);
    }
}
