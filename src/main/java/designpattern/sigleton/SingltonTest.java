package designpattern.sigleton;

public class SingltonTest {

    public static void main(String[] args) {
/*

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);

*/

        for (int i = 0; i < 100; i++) {
            new Thread() {
                public void run() {
                    Singleton.getInstance();
                }
            }.start();
        }


    }
}
