package j8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * User: liubo
 * Datetime: 2017/6/2817:56
 */
public class SMFactory {
    public static Map<String, Supplier> map = new HashMap<>();

    static {
        map.put("CIRCLE", Circle::new);
        map.put("RACTANGLE", Ractangle::new);
    }

    public Shape getShape(String shapeType) {
        Supplier<Shape> shape = map.get(shapeType.toUpperCase());
        if (shape != null) {
            return shape.get();
        }
        throw new IllegalArgumentException("No such shape " + shapeType.toUpperCase());
    }
}
