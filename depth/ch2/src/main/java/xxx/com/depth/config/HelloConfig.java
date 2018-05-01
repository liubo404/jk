package xxx.com.depth.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * User: liubo
 * Datetime: 2017/12/2922:32
 */
@Configuration
public class HelloConfig {

    @Bean
    public String greeting() {
        return "world";
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);

        String text = (String) context.getBean("greeting");

        System.out.println("Hello " + text );

    }
}
