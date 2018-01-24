package cn.sxt.dao;

import cn.sxt.bean.Torder_shipping;
import cn.sxt.bean.Torder_shippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Torder_shippingMapper {
    int countByExample(Torder_shippingExample example);

    int deleteByExample(Torder_shippingExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(Torder_shipping record);

    int insertSelective(Torder_shipping record);

    List<Torder_shipping> selectByExample(Torder_shippingExample example);

    Torder_shipping selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") Torder_shipping record, @Param("example") Torder_shippingExample example);

    int updateByExample(@Param("record") Torder_shipping record, @Param("example") Torder_shippingExample example);

    int updateByPrimaryKeySelective(Torder_shipping record);

    int updateByPrimaryKey(Torder_shipping record);
}