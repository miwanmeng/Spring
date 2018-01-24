package cn.sxt.dao;

import cn.sxt.bean.Titem_param;
import cn.sxt.bean.Titem_paramExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Titem_paramMapper {
    int countByExample(Titem_paramExample example);

    int deleteByExample(Titem_paramExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Titem_param record);

    int insertSelective(Titem_param record);

    List<Titem_param> selectByExampleWithBLOBs(Titem_paramExample example);

    List<Titem_param> selectByExample(Titem_paramExample example);

    Titem_param selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Titem_param record, @Param("example") Titem_paramExample example);

    int updateByExampleWithBLOBs(@Param("record") Titem_param record, @Param("example") Titem_paramExample example);

    int updateByExample(@Param("record") Titem_param record, @Param("example") Titem_paramExample example);

    int updateByPrimaryKeySelective(Titem_param record);

    int updateByPrimaryKeyWithBLOBs(Titem_param record);

    int updateByPrimaryKey(Titem_param record);
}