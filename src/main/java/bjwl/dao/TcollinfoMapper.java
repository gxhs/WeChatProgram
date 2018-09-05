package bjwl.dao;

import bjwl.pojo.Tcollinfo;
import bjwl.pojo.Example.TcollinfoExample;
import bjwl.pojo.Key.TcollinfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcollinfoMapper {
    //计数
    int countByExample(TcollinfoExample example);
    //删除根据自定义属性
    int deleteByExample(TcollinfoExample example);

    int deleteByPrimaryKey(TcollinfoKey key);

    //插入全部
    int insert(Tcollinfo record);

    //插入可以有空值
    int insertSelective(Tcollinfo record);

    //查找根据自定义属性
    List<Tcollinfo> selectByExample(TcollinfoExample example);

    //根据主键查找
    Tcollinfo selectByPrimaryKey(TcollinfoKey key);

    //根据example（自己设置字段） 实体不为空的字段更新
    int updateByExampleSelective(@Param("record") Tcollinfo record, @Param("example") TcollinfoExample example);

    //更新通过自定义属性
    int updateByExample(@Param("record") Tcollinfo record, @Param("example") TcollinfoExample example);

    //根据id 实体不为空的字段更新
    int updateByPrimaryKeySelective(Tcollinfo record);

    //根据主键插入
    int updateByPrimaryKey(Tcollinfo record);
}