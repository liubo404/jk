package ocp.ch4;

import java.util.Optional;

/**
 * User: liubo
 * Datetime: 2017/9/1920:40
 */
public class OptionalTest {
    public static void main(String[] args) {

        System.out.println(average());

        Optional<Double> opt = average(90, 100);
        if(opt.isPresent()){
            System.out.println(opt.get());
        }

    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.ofNullable((double) sum / scores.length);
    }
}
