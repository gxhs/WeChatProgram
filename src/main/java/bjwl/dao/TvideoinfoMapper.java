package bjwl.dao;

import bjwl.pojo.Tvideoinfo;
import bjwl.pojo.Example.TvideoinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TvideoinfoMapper {
    int countByExample(TvideoinfoExample example);

    int deleteByExample(TvideoinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tvideoinfo record);

    int insertSelective(Tvideoinfo record);

    List<Tvideoinfo> selectByExample(TvideoinfoExample example);

    Tvideoinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tvideoinfo record, @Param("example") TvideoinfoExample example);

    int updateByExample(@Param("record") Tvideoinfo record, @Param("example") TvideoinfoExample example);

    int updateByPrimaryKeySelective(Tvideoinfo record);

    int updateByPrimaryKey(Tvideoinfo record);
}