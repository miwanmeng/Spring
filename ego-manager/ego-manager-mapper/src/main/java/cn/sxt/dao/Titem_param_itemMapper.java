package cn.sxt.dao;

import cn.sxt.bean.Titem_param_item;
import cn.sxt.bean.Titem_param_itemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Titem_param_itemMapper {
    int countByExample(Titem_param_itemExample example);

    int deleteByExample(Titem_param_itemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Titem_param_item record);

    int insertSelective(Titem_param_item record);

    List<Titem_param_item> selectByExampleWithBLOBs(Titem_param_itemExample example);

    List<Titem_param_item> selectByExample(Titem_param_itemExample example);

    Titem_param_item selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Titem_param_item record, @Param("example") Titem_param_itemExample example);

    int updateByExampleWithBLOBs(@Param("record") Titem_param_item record, @Param("example") Titem_param_itemExample example);

    int updateByExample(@Param("record") Titem_param_item record, @Param("example") Titem_param_itemExample example);

    int updateByPrimaryKeySelective(Titem_param_item record);

    int updateByPrimaryKeyWithBLOBs(Titem_param_item record);

    int updateByPrimaryKey(Titem_param_item record);
}