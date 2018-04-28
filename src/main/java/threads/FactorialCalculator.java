package threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FactorialCalculator implements Callable<Integer> {
    private static final Logger log = LoggerFactory.getLogger(CallableExample.class);

    private Integer number;

    public FactorialCalculator(Integer number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        if (number == 0 || number == 1) {
            return 1;
        } else {
            for (int i = 2; i <= number; i++) {
                result *= i;
                TimeUnit.MILLISECONDS.sleep(2000);
            }
        }
       log.info("Result for number - {} -> {}", number, result);
        return result;
    }
}
