package threads;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * https://www.callicoder.com/java-callable-and-future-tutorial/
 */
public class CallableExample {
    private static final Logger log = LoggerFactory.getLogger(CallableExample.class);

    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        List<Future<Integer>> resultList = Lists.newArrayList();

        Random random = new Random();

        for(int i =0; i <4; i++){
            Integer number = random.nextInt(10);
            FactorialCalculator calculator = new FactorialCalculator(number);
            Future<Integer> result = executor.submit(calculator);
            resultList.add(result);
        }


        for(Future<Integer> future: resultList){
            try {
                log.info("Future result is - - {} ; and Task done is {}",future.get(),future.isDone());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
