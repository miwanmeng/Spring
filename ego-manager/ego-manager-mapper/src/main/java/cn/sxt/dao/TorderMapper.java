package cn.sxt.dao;

import cn.sxt.bean.Torder;
import cn.sxt.bean.TorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TorderMapper {
    int countByExample(TorderExample example);

    int deleteByExample(TorderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(Torder record);

    int insertSelective(Torder record);

    List<Torder> selectByExample(TorderExample example);

    Torder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") Torder record, @Param("example") TorderExample example);

    int updateByExample(@Param("record") Torder record, @Param("example") TorderExample example);

    int updateByPrimaryKeySelective(Torder record);

    int updateByPrimaryKey(Torder record);
}