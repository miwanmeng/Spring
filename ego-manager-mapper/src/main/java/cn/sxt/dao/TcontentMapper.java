package cn.sxt.dao;

import cn.sxt.bean.Tcontent;
import cn.sxt.bean.TcontentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcontentMapper {
    int countByExample(TcontentExample example);

    int deleteByExample(TcontentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tcontent record);

    int insertSelective(Tcontent record);

    List<Tcontent> selectByExampleWithBLOBs(TcontentExample example);

    List<Tcontent> selectByExample(TcontentExample example);

    Tcontent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tcontent record, @Param("example") TcontentExample example);

    int updateByExampleWithBLOBs(@Param("record") Tcontent record, @Param("example") TcontentExample example);

    int updateByExample(@Param("record") Tcontent record, @Param("example") TcontentExample example);

    int updateByPrimaryKeySelective(Tcontent record);

    int updateByPrimaryKeyWithBLOBs(Tcontent record);

    int updateByPrimaryKey(Tcontent record);
}