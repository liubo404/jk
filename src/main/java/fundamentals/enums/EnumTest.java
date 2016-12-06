package fundamentals.enums;

public class EnumTest {

	public static void main(String[] args) {
		/*for (HomeServiceOrderStatus n : HomeServiceOrderStatus.values()) {
			System.out.println(n.key() + " " + n.value());
 			
		}
		*/
		System.out.println(HomeServiceOrderStatus.CANCEL_BY_ADMIN.key());
	}

}
