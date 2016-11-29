package jvm;

public class IntEqualTest {

	public static void main(String[] args) {

		int a1 = 1;
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		Integer d = 3;
		Integer e = 321;
		Integer f = 321;
		Long g = 3L;

		System.out.println(c == d);
		System.out.println(e == f);
		System.out.println(c == (a + b));
		System.out.println(c.equals(a + b));
		System.out.println(g == (a + b));

		System.out.println(c.hashCode());
		System.out.println(d.hashCode());

		Integer x = 345;
		int y = 345;
		System.out.println(g.equals(a + b));
		System.out.println(g.equals(3));
		System.out.println(x.equals(y));
	}
}
