package j8;

import java.util.function.Supplier;

/**
 * User: liubo
 * Datetime: 2017/6/2817:59
 */
public class SMDemo {
    public static void main(String[] args) {
        Supplier<SMFactory> factory = SMFactory::new;

        factory.get().getShape("circle").draw();
        factory.get().getShape("ractangle").draw();
    }
}
