package cn.sxt.dao;

import cn.sxt.bean.Titem_cat;
import cn.sxt.bean.Titem_catExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Titem_catMapper {
    int countByExample(Titem_catExample example);

    int deleteByExample(Titem_catExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Titem_cat record);

    int insertSelective(Titem_cat record);

    List<Titem_cat> selectByExample(Titem_catExample example);

    Titem_cat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Titem_cat record, @Param("example") Titem_catExample example);

    int updateByExample(@Param("record") Titem_cat record, @Param("example") Titem_catExample example);

    int updateByPrimaryKeySelective(Titem_cat record);

    int updateByPrimaryKey(Titem_cat record);
}