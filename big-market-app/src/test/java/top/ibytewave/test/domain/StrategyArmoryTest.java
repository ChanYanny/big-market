package top.ibytewave.test.domain;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.ibytewave.domain.strategy.model.entity.StrategyAwardEntity;
import top.ibytewave.domain.strategy.service.armory.IStrategyArmory;
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
public class StrategyArmoryTest {

    @Resource
    private IStrategyArmory strategyArmory;

    @Resource
    private IRedisService redisService;

    /**
     * 策略ID；100001L、100002L 装配的时候创建策略表写入到 Redis Map 中
     */
    @Test
    public void test_strategyArmory() {
        boolean success = strategyArmory.assembleLotteryStrategy(100002L);
        log.info("测试结果：{}", success);
    }

    /**
     * 从装配的策略中随机获取奖品ID值
     */
    @Test
    public void test_getAssembleRandomVal() {
        log.info("测试结果：{} - 奖品ID值", strategyArmory.getRandomAwardId(100002L));
    }

    @Test
    public void test() {
        List<StrategyAwardEntity> list = redisService.getValue(Constants.RedisKey.STRATEGY_AWARD_KEY + 100002L);
        int size = redisService.getValue(Constants.RedisKey.STRATEGY_RATE_RANGE_KEY + 100002L);
        log.info("list={}, size={}", list, size);
    }



}

