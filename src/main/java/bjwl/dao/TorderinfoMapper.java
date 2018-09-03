package bjwl.dao;

import bjwl.pojo.Torderinfo;
import bjwl.pojo.Example.TorderinfoExample;
import bjwl.pojo.Key.TorderinfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TorderinfoMapper {
    int countByExample(TorderinfoExample example);

    int deleteByExample(TorderinfoExample example);

    int deleteByPrimaryKey(TorderinfoKey key);

    int insert(Torderinfo record);

    int insertSelective(Torderinfo record);

    List<Torderinfo> selectByExample(TorderinfoExample example);

    Torderinfo selectByPrimaryKey(TorderinfoKey key);

    int updateByExampleSelective(@Param("record") Torderinfo record, @Param("example") TorderinfoExample example);

    int updateByExample(@Param("record") Torderinfo record, @Param("example") TorderinfoExample example);

    int updateByPrimaryKeySelective(Torderinfo record);

    int updateByPrimaryKey(Torderinfo record);
}