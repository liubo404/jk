package xxx.com.jpa.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 类 名: Application
 * 描 述:
 * <p>
 * 作 者: liubo
 * 创 建: 2017/12/29 12:06
 * 版 本: 1.0
 * <p>
 * 历 史: (版本) 作者 时间 注释
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public StartupRunner commandLineRunner() {
        return new StartupRunner();
    }

}
