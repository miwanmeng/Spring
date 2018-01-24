package cn.sxt.dao;

import cn.sxt.bean.Titem_desc;
import cn.sxt.bean.Titem_descExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Titem_descMapper {
    int countByExample(Titem_descExample example);

    int deleteByExample(Titem_descExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(Titem_desc record);

    int insertSelective(Titem_desc record);

    List<Titem_desc> selectByExampleWithBLOBs(Titem_descExample example);

    List<Titem_desc> selectByExample(Titem_descExample example);

    Titem_desc selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") Titem_desc record, @Param("example") Titem_descExample example);

    int updateByExampleWithBLOBs(@Param("record") Titem_desc record, @Param("example") Titem_descExample example);

    int updateByExample(@Param("record") Titem_desc record, @Param("example") Titem_descExample example);

    int updateByPrimaryKeySelective(Titem_desc record);

    int updateByPrimaryKeyWithBLOBs(Titem_desc record);

    int updateByPrimaryKey(Titem_desc record);
}