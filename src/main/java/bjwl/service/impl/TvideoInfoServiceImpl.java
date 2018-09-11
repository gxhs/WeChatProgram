package bjwl.service.impl;

import bjwl.dao.TvideoinfoMapper;
import bjwl.pojo.Example.TvideoinfoExample;
import bjwl.pojo.Tvideoinfo;
import bjwl.service.TvideoInfoService;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TvideoInfoServiceImpl implements TvideoInfoService {

    @Autowired
    TvideoinfoMapper tvideoinfoMapper;

    @Override
    public List<Tvideoinfo> getVideo(int ID) {
        TvideoinfoExample tvideoinfoExample=new TvideoinfoExample();
        TvideoinfoExample.Criteria criteria =tvideoinfoExample.createCriteria();
        criteria.andIdEqualTo(ID);
        return tvideoinfoMapper.selectByExample(tvideoinfoExample);
    }

    @Override
    public void updateClickNumByid(Tvideoinfo tvideoinfo) {
        tvideoinfoMapper.updateByPrimaryKeySelective(tvideoinfo);
    }

    @Override
    public List<Tvideoinfo> getListAll() {
        return tvideoinfoMapper.getListAll();
    }

    @Override
    public List<Tvideoinfo> getVideoByTypeId(int typeId) {
        TvideoinfoExample tvideoinfoExample=new TvideoinfoExample();
        TvideoinfoExample.Criteria criteria =tvideoinfoExample.createCriteria();
        criteria.andTypeidEqualTo(typeId);
        return tvideoinfoMapper.selectByExample(tvideoinfoExample);
    }
    @Override
    public List<Tvideoinfo> findMovie(String findName) {
        return tvideoinfoMapper.findMovie(findName);
    }
}
