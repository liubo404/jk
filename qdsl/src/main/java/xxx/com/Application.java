package xxx.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * User: liubo
 * Datetime: 2018/1/2216:35
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
