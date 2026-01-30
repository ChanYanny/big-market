package top.ibytewave.test.infrastructure;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.ibytewave.infrastructure.persistent.dao.IAwardDao;
import top.ibytewave.infrastructure.persistent.po.Award;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ChanYanny
 * @date 2026/01/30 14:05
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDaoTest {

    @Resource
    private IAwardDao awardDao;

    @Test
    public void test_queryAwardList() {
        List<Award> awards = awardDao.queryAwardList();
        log.info("awards: {}", JSON.toJSONString(awards));
    }

}

