package top.ibytewave.domain.strategy.service.rule.filter;

import top.ibytewave.domain.strategy.model.entity.RuleActionEntity;
import top.ibytewave.domain.strategy.model.entity.RuleMatterEntity;

/**
 * @author ChanYanny
 * @description 抽奖规则过滤接口
 * @date 2026/02/01 19:35
 **/
public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {

    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);

}


