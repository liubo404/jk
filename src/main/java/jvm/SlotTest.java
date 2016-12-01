package jvm;

public class SlotTest {

	public static void sayHi() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {

		SlotTest.sayHi();

		{
			byte[] p = new byte[64 * 1024 * 1024];
		}
		int a = 0;
		System.gc();
	}

}