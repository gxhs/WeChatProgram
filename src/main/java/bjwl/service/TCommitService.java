package bjwl.service;

import bjwl.pojo.Tcommit;

import java.util.List;

public interface TCommitService {

    int insert(Tcommit tcommit);
    //根据视频id 获取评论
    List<Tcommit> selectbyTvideoId(int id);
    //获取视频评论数
    int countById(int id);
}
