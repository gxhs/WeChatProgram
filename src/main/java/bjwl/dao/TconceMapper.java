package bjwl.dao;

import bjwl.pojo.Example.TconceExample;
import bjwl.pojo.Tconce;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TconceMapper {
    int countByExample(TconceExample example);

    int deleteByExample(TconceExample example);

    int deleteByPrimaryKey(Integer yhjid);

    int insert(Tconce record);

    int insertSelective(Tconce record);

    List<Tconce> selectByExample(TconceExample example);

    Tconce selectByPrimaryKey(Integer yhjid);

    int updateByExampleSelective(@Param("record") Tconce record, @Param("example") TconceExample example);

    int updateByExample(@Param("record") Tconce record, @Param("example") TconceExample example);

    int updateByPrimaryKeySelective(Tconce record);

    int updateByPrimaryKey(Tconce record);
}