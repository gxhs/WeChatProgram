package bjwl.dao;

import bjwl.pojo.Tmenberinfo;
import bjwl.pojo.Example.TmenberinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmenberinfoMapper {
    int countByExample(TmenberinfoExample example);

    int deleteByExample(TmenberinfoExample example);

    int deleteByPrimaryKey(Integer memid);

    int insert(Tmenberinfo record);

    int insertSelective(Tmenberinfo record);

    List<Tmenberinfo> selectByExample(TmenberinfoExample example);

    Tmenberinfo selectByPrimaryKey(Integer memid);

    int updateByExampleSelective(@Param("record") Tmenberinfo record, @Param("example") TmenberinfoExample example);

    int updateByExample(@Param("record") Tmenberinfo record, @Param("example") TmenberinfoExample example);

    int updateByPrimaryKeySelective(Tmenberinfo record);

    int updateByPrimaryKey(Tmenberinfo record);

    int selectCountUser(String memName);
    Tmenberinfo selectIdBymemName(String memName);
}