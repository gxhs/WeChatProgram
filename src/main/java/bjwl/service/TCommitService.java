package bjwl.service;

import bjwl.pojo.Tcommit;

import java.util.List;

public interface TCommitService {

    void insert(Tcommit tcommit);
    //根据视频id 获取评论
    List<Tcommit> selectbyTvideoId(int id);
}
