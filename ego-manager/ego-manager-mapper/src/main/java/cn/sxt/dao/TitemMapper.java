package cn.sxt.dao;

import cn.sxt.bean.Titem;
import cn.sxt.bean.TitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TitemMapper {
    int countByExample(TitemExample example);

    int deleteByExample(TitemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Titem record);

    int insertSelective(Titem record);

    List<Titem> selectByExample(TitemExample example);

    Titem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Titem record, @Param("example") TitemExample example);

    int updateByExample(@Param("record") Titem record, @Param("example") TitemExample example);

    int updateByPrimaryKeySelective(Titem record);

    int updateByPrimaryKey(Titem record);
}