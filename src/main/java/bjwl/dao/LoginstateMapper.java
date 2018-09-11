package bjwl.dao;

import bjwl.pojo.Example.LoginstateExample;
import bjwl.pojo.Loginstate;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginstateMapper {
    int countByExample(LoginstateExample example);

    int deleteByExample(LoginstateExample example);

    int deleteByPrimaryKey(String appid);

    int insert(Loginstate record);

    int insertSelective(Loginstate record);

    List<Loginstate> selectByExample(LoginstateExample example);

    Loginstate selectByPrimaryKey(String appid);

    int updateByExampleSelective(@Param("record") Loginstate record, @Param("example") LoginstateExample example);

    int updateByExample(@Param("record") Loginstate record, @Param("example") LoginstateExample example);

    int updateByPrimaryKeySelective(Loginstate record);

    int updateByPrimaryKey(Loginstate record);
}