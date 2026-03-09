package top.ibytewave.domain.strategy.service.rule.tree.factory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import top.ibytewave.domain.strategy.model.valobj.RuleLogicCheckTypeVO;
import top.ibytewave.domain.strategy.model.valobj.RuleTreeVO;
import top.ibytewave.domain.strategy.service.rule.tree.ILogicTreeNode;
import top.ibytewave.domain.strategy.service.rule.tree.factory.engine.IDecisionTreeEngine;
import top.ibytewave.domain.strategy.service.rule.tree.factory.engine.impl.DecisionTreeEngine;

import java.util.Map;

/**
 * @author ChanYanny
 * @description 规则树工厂
 * @date 2026/02/27 20:30
 **/
@Service
public class DefaultTreeFactory {

    private final Map<String, ILogicTreeNode> logicTreeNodeGroup;

    public DefaultTreeFactory(Map<String, ILogicTreeNode> logicTreeNodeGroup) {
        this.logicTreeNodeGroup = logicTreeNodeGroup;
    }

    public IDecisionTreeEngine openLogicTree(RuleTreeVO ruleTreeVO) {
        return new DecisionTreeEngine(logicTreeNodeGroup, ruleTreeVO);
    }

    /**
     * 决策树动作实体
     */
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TreeActionEntity {
        private RuleLogicCheckTypeVO ruleLogicCheckType;
        private StrategyAwardData strategyAwardData;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class StrategyAwardData {
        /** 抽奖奖品ID - 内部流转使用 */
        private Integer awardId;
        /** 抽奖奖品规则 */
        private String awardRuleValue;
    }

}


