package top.ibytewave.domain.strategy.service.armory;

/**
 * @author ChanYanny
 * @description 策略抽奖调度
 * @date 2026/01/31 20:56
 **/
public interface IStrategyDispatch {

    /**
     * 获取抽奖策略装配的随机结果
     *
     * @param strategyId 策略ID
     * @return 抽奖结果
     */
    Integer getRandomAwardId(Long strategyId);

    // ruleWeightValue  =   "4000:102,103,104,105"
    //                      "5000:102,103,104,105,106,107"
    //                      "6000:102,103,104,105,106,107,108,109"
    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);

    /**
     * 根据策略ID和奖品ID，扣减奖品缓存库存
     *
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return 扣减结果
     */
    Boolean subtractionAwardStock(Long strategyId, Integer awardId);


}

