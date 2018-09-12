package bjwl.service.impl;

import bjwl.dao.TconceMapper;
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
        return null;
    }

    @Override
    public int addTconecByUserID(Tconce tconce) {
        return tconceMapper.insertSelective(tconce);
    }
}
