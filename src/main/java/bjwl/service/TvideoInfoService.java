package bjwl.service;

import bjwl.pojo.Tvideoinfo;

import java.util.List;

public interface TvideoInfoService {

    List<Tvideoinfo> getVideo(int ID);
    //根据id更新不为空字段
    void updateClickNumByid(Tvideoinfo tvideoinfo);
    List<Tvideoinfo> getListAll();
    List<Tvideoinfo> getVideoByTypeId(int typeId);
}
