package bjwl.service.impl;

import bjwl.dao.TvideotypeMapper;
import bjwl.pojo.Example.TvideotypeExample;
import bjwl.pojo.Tvideotype;
import bjwl.service.TVideoTypeService;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TVideoTypeServiceImpl implements TVideoTypeService {

    @Autowired
    TvideotypeMapper tvideotypeMapper;

    @Override
    public List<Tvideotype> list() {
        TvideotypeExample tvideotypeExample=new TvideotypeExample();
        TvideotypeExample.Criteria criteria=tvideotypeExample.createCriteria();
        criteria.andTypeidIsNotNull();
        return tvideotypeMapper.selectByExample(tvideotypeExample);
    }
}
