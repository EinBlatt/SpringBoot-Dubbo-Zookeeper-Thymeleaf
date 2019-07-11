package problemshowconsumer.problemshowconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class ProblemShowConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProblemShowConsumerApplication.class, args);
    }

}
