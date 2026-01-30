package top.ibytewave.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import top.ibytewave.infrastructure.persistent.po.StrategyAward;

import java.util.List;

/**
 * @author ChanYanny
 * @date 2026/01/30 13:47
 **/
@Mapper
public interface IStrategyAwardDao {

    List<StrategyAward> queryStrategyAwardList();

}

