package top.ibytewave.domain.strategy.service.rule.tree.factory.engine;

import top.ibytewave.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @author ChanYanny
 * @description 规则树组合接口
 * @date 2026/2/27 20:32
 */
public interface IDecisionTreeEngine {

    DefaultTreeFactory.StrategyAwardData process(String userId, Long strategyId, Integer awardId);

}

