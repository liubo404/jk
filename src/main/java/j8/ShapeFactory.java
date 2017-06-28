package j8;

/**
 * User: liubo
 * Datetime: 2017/6/2817:50
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RACTANGLE")) {
            return new Ractangle();
        }
        return null;
    }
}
