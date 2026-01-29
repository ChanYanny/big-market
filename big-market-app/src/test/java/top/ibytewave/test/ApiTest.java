package top.ibytewave.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ChanYanny
 * @date 2026/01/29 19:03
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {

    @Test
    public void test() {
        log.info("测试完成");
    }

}


