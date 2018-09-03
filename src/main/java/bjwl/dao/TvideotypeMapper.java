package bjwl.dao;

import bjwl.pojo.Tvideotype;
import bjwl.pojo.Example.TvideotypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TvideotypeMapper {
    int countByExample(TvideotypeExample example);

    int deleteByExample(TvideotypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(Tvideotype record);

    int insertSelective(Tvideotype record);

    List<Tvideotype> selectByExample(TvideotypeExample example);

    Tvideotype selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") Tvideotype record, @Param("example") TvideotypeExample example);

    int updateByExample(@Param("record") Tvideotype record, @Param("example") TvideotypeExample example);

    int updateByPrimaryKeySelective(Tvideotype record);

    int updateByPrimaryKey(Tvideotype record);
}