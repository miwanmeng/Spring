package cn.sxt.dao;

import cn.sxt.bean.Tcontent_category;
import cn.sxt.bean.Tcontent_categoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tcontent_categoryMapper {
    int countByExample(Tcontent_categoryExample example);

    int deleteByExample(Tcontent_categoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tcontent_category record);

    int insertSelective(Tcontent_category record);

    List<Tcontent_category> selectByExample(Tcontent_categoryExample example);

    Tcontent_category selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tcontent_category record, @Param("example") Tcontent_categoryExample example);

    int updateByExample(@Param("record") Tcontent_category record, @Param("example") Tcontent_categoryExample example);

    int updateByPrimaryKeySelective(Tcontent_category record);

    int updateByPrimaryKey(Tcontent_category record);
}