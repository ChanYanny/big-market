package top.ibytewave.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import top.ibytewave.infrastructure.persistent.po.StrategyRule;

import java.util.List;

/**
 * @author ChanYanny
 * @date 2026/1/30 13:48
 */
@Mapper
public interface IStrategyRuleDao {

    List<StrategyRule> queryStrategyRuleList();

}
