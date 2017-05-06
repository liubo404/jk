package ios.csv;

import java.io.File;

/**
 * User: liubo
 * Datetime: 2017/5/512:21
 */
public class TestCSV {
    public static void main(String... a)
    {
        Product[] list = new Product[5];
        list[0] = new Product("dvd", 24.99, 967, true);
        list[1] = new Product("pen", 4.99, 162, false);
        list[2] = new Product("ipad", 624.99, 234, true);
        list[3] = new Product("crayons", 4.99,127, false);
        list[4] = new Product("laptop", 1444.99, 997, true);
        CSVWriter.generateCSV(new File("d:\\products.csv"),list);
    }


}
