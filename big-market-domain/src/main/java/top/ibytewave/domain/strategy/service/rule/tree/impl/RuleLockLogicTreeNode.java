package top.ibytewave.domain.strategy.service.rule.tree.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.ibytewave.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import top.ibytewave.domain.strategy.service.rule.tree.ILogicTreeNode;
import top.ibytewave.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @author ChanYanny
 * @description 次数锁节点
 * @date 2026/02/27 20:22
 **/
@Slf4j
@Component("rule_lock")
public class RuleLockLogicTreeNode implements ILogicTreeNode {

    @Override
    public DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId) {
        return DefaultTreeFactory.TreeActionEntity.builder()
                .ruleLogicCheckType(RuleLogicCheckTypeVO.ALLOW)
                .build();
    }

}


