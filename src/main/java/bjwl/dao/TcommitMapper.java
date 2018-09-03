package bjwl.dao;

import bjwl.pojo.Tcommit;
import bjwl.pojo.Example.TcommitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcommitMapper {
    int countByExample(TcommitExample example);

    int deleteByExample(TcommitExample example);

    int deleteByPrimaryKey(String plid);

    int insert(Tcommit record);

    int insertSelective(Tcommit record);

    List<Tcommit> selectByExample(TcommitExample example);

    Tcommit selectByPrimaryKey(String plid);

    int updateByExampleSelective(@Param("record") Tcommit record, @Param("example") TcommitExample example);

    int updateByExample(@Param("record") Tcommit record, @Param("example") TcommitExample example);

    int updateByPrimaryKeySelective(Tcommit record);

    int updateByPrimaryKey(Tcommit record);
}