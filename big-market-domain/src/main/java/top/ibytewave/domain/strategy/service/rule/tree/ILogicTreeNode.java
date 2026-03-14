package top.ibytewave.domain.strategy.service.rule.tree;

import top.ibytewave.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @author ChanYanny
 * @description 规则树接口
 * @date 2026/02/27 20:19
 **/
public interface ILogicTreeNode {

    DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId, String ruleValue);

}


