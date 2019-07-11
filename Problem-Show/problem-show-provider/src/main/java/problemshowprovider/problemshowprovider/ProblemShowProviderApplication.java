package problemshowprovider.problemshowprovider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("problemshowprovider.problemshowprovider")
@EnableDubbo
public class ProblemShowProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProblemShowProviderApplication.class, args);
    }

}
