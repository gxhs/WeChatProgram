package bjwl.service;

import bjwl.pojo.Key.TcollinfoKey;
import bjwl.pojo.Tcollinfo;
import bjwl.pojo.Tvideoinfo;

import java.util.List;

public interface TCollInfoService {

    int insert(Tcollinfo tcollinfo);
    //我的收藏
    List<Tcollinfo> selectVideobyUserId(Integer id);
    //取消收藏
    int delete(TcollinfoKey tcollinfoKey);
    //视频收藏人数
    int countByVideoId(int id);
    //主键查询
    Tcollinfo countByKey(TcollinfoKey tcollinfoKey);
}
