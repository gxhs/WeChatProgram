package bjwl.service.impl;

import bjwl.dao.TcollinfoMapper;
import bjwl.pojo.Example.TcollinfoExample;
import bjwl.pojo.Key.TcollinfoKey;
import bjwl.pojo.Tcollinfo;
import bjwl.service.TCollInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCollInfoServiceImpl implements TCollInfoService {

    @Autowired
    TcollinfoMapper tcollinfoMapper;

    @Override
    public int insert(Tcollinfo tcollinfo){
       return tcollinfoMapper.insert(tcollinfo);
    }

    public List<Tcollinfo> selectVideobyUserId(Integer id) {
        TcollinfoExample tcollinfoExample=new TcollinfoExample();
        TcollinfoExample.Criteria criteria=tcollinfoExample.createCriteria();
        criteria.andMemidEqualTo(id);
        return tcollinfoMapper.selectByExample(tcollinfoExample);
    }

    @Override
    public int delete(TcollinfoKey tcollinfoKey) {
        return tcollinfoMapper.deleteByPrimaryKey(tcollinfoKey);
    }

    @Override
    public int countByVideoId(int id) {
        TcollinfoExample tcollinfoExample=new TcollinfoExample();
        TcollinfoExample.Criteria criteria=tcollinfoExample.createCriteria();
        criteria.andIdEqualTo(id);
        return tcollinfoMapper.countByExample(tcollinfoExample);
    }

    @Override
    public Tcollinfo countByKey(TcollinfoKey tcollinfoKey) {
//        TcollinfoExample tcollinfoExample =new TcollinfoExample();
//        TcollinfoExample.Criteria criteria=tcollinfoExample.createCriteria();
        return tcollinfoMapper.selectByPrimaryKey(tcollinfoKey);
    }
}
