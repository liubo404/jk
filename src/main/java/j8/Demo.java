package j8;

/**
 * User: liubo
 * Datetime: 2017/6/2817:52
 */
public class Demo {


    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.getShape("CIRCLE");
        s1.draw();

        Shape s2 = factory.getShape("RACTANGLE");
        s2.draw();

    }
}
