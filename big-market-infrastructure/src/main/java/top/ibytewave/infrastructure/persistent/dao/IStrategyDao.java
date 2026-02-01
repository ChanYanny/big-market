package top.ibytewave.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import top.ibytewave.infrastructure.persistent.po.Strategy;

import java.util.List;

/**
 * @author ChanYanny
 * @date 2026/1/30 13:46
 */
@Mapper
public interface IStrategyDao {

    List<Strategy> queryStrategyList();

    Strategy queryStrategyByStrategyId(Long strategyId);
}
