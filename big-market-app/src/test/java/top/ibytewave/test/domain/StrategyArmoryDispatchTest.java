package top.ibytewave.test.domain;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.C;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RMap;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.ibytewave.domain.strategy.model.entity.StrategyAwardEntity;
import top.ibytewave.domain.strategy.service.armory.IStrategyArmory;
import top.ibytewave.domain.strategy.service.armory.IStrategyDispatch;
import top.ibytewave.infrastructure.persistent.redis.IRedisService;
import top.ibytewave.types.common.Constants;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ChanYanny
 * @date 2026/01/30 21:17
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyArmoryDispatchTest {

    @Resource
    private IStrategyArmory strategyArmory;

    @Resource
    private IRedisService redisService;

    @Resource
    private IStrategyDispatch strategyDispatch;

    /**
     * 策略ID；100001L、100002L 装配的时候创建策略表写入到 Redis Map 中
     */
    @Before
    public void test_strategyArmory() {
        boolean success = strategyArmory.assembleLotteryStrategy(100001L);
        log.info("测试结果：{}", success);
    }

    /**
     * 从装配的策略中随机获取奖品ID值
     */
    @Test
    public void test_getAssembleRandomVal() {
        log.info("测试结果：{} - 奖品ID值", strategyDispatch.getRandomAwardId(100001L));
    }

    @Test
    public void test_getAssembleRandomVal_ruleWeightValue() {
        log.info("测试结果：{} - 4000 策略配置", strategyDispatch.getRandomAwardId(100001L, "4000:102,103,104,105"));
        log.info("测试结果：{} - 5000 策略配置", strategyDispatch.getRandomAwardId(100001L, "5000:102,103,104,105,106,107"));
        log.info("测试结果：{} - 6000 策略配置", strategyDispatch.getRandomAwardId(100001L, "6000:102,103,104,105,106,107,108,109"));

    }

    @Test
    public void test() {
        List<StrategyAwardEntity> list = redisService.getValue(Constants.RedisKey.STRATEGY_AWARD_KEY + 100001L);
        int size = redisService.getValue(Constants.RedisKey.STRATEGY_RATE_RANGE_KEY + 100001L);
        RMap<Integer, Integer> map = redisService.getMap(Constants.RedisKey.STRATEGY_RATE_TABLE_KEY + 100001L);
        log.info("list={}, size={}, map={}", list, size, JSON.toJSONString(map));
    }



}

