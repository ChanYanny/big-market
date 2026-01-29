package top.ibytewave;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ChanYanny
 * @date 2026/01/29 15:51
 **/
@SpringBootApplication
@Configurable
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

