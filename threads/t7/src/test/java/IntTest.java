public class IntTest {
    public static void main(String[] args) {
        int i = 10;
//        i = i +0.2f;
        short s1 = 1;
        // 这一行代码会报编译错误,因为 s1 +1 的类型为int
//         s1 = s1 + 1;
        // 这一行代码没有报错
        s1 = 1 + 1;
        // 这一行代码也没有报错
        s1 += 1;

    }
}
