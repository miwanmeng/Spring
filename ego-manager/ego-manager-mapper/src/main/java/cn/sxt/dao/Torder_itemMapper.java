package cn.sxt.dao;

import cn.sxt.bean.Torder_item;
import cn.sxt.bean.Torder_itemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Torder_itemMapper {
    int countByExample(Torder_itemExample example);

    int deleteByExample(Torder_itemExample example);

    int deleteByPrimaryKey(String id);

    int insert(Torder_item record);

    int insertSelective(Torder_item record);

    List<Torder_item> selectByExample(Torder_itemExample example);

    Torder_item selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Torder_item record, @Param("example") Torder_itemExample example);

    int updateByExample(@Param("record") Torder_item record, @Param("example") Torder_itemExample example);

    int updateByPrimaryKeySelective(Torder_item record);

    int updateByPrimaryKey(Torder_item record);
}