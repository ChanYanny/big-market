package top.ibytewave.domain.strategy.service.rule.chain;

/**
 * @author ChanYanny
 * @description 抽奖策略规则责任链接口
 * @date 2026/2/25 20:25
 */
public interface ILogicChain extends ILogicChainArmory{

    /**
     * 责任链接口
     *
     * @param userId     用户ID
     * @param strategyId 策略ID
     * @return 奖品ID
     */
    Integer logic(String userId, Long strategyId);

}

