package wiki.heh.bald.pay.api.mapper;

import org.apache.ibatis.annotations.Param;
import wiki.heh.bald.pay.api.entity.po.PayChannel;
import wiki.heh.bald.pay.api.entity.po.PayChannelExample;

import java.util.List;

public interface PayChannelMapper {
    int countByExample(PayChannelExample example);

    int deleteByExample(PayChannelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PayChannel record);

    int insertSelective(PayChannel record);

    List<PayChannel> selectByExample(PayChannelExample example);

    PayChannel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PayChannel record, @Param("example") PayChannelExample example);

    int updateByExample(@Param("record") PayChannel record, @Param("example") PayChannelExample example);

    int updateByPrimaryKeySelective(PayChannel record);

    int updateByPrimaryKey(PayChannel record);
}