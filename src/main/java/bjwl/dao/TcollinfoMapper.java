package bjwl.dao;

import bjwl.pojo.Tcollinfo;
import bjwl.pojo.Example.TcollinfoExample;
import bjwl.pojo.Key.TcollinfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcollinfoMapper {
    int countByExample(TcollinfoExample example);

    int deleteByExample(TcollinfoExample example);

    int deleteByPrimaryKey(TcollinfoKey key);

    int insert(Tcollinfo record);

    int insertSelective(Tcollinfo record);

    //查找根据自定义属性
    List<Tcollinfo> selectByExample(TcollinfoExample example);

    Tcollinfo selectByPrimaryKey(TcollinfoKey key);

    //根据example（自己设置字段） 实体不为空的字段更新
    int updateByExampleSelective(@Param("record") Tcollinfo record, @Param("example") TcollinfoExample example);

    int updateByExample(@Param("record") Tcollinfo record, @Param("example") TcollinfoExample example);

    //根据id 实体不为空的字段更新
    int updateByPrimaryKeySelective(Tcollinfo record);

    int updateByPrimaryKey(Tcollinfo record);
}