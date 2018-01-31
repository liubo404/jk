package xxx.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

/**
 * User: liubo
 * Datetime: 2018/1/2216:40
 */
public class StartupRunner implements CommandLineRunner {
    Logger log = LoggerFactory.getLogger(StartupRunner.class);

    @Override
    public void run(String... strings) throws Exception {
        log.info("start up command line runner ...");

    }
}
