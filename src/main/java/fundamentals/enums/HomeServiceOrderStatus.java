package fundamentals.enums;

public enum HomeServiceOrderStatus {
	 SUCCESS(0, "服务完成"),

     UNPAID(1, "待支付"),
     PAID(2, "已支付"),
     HAS_ACCEPT(3, "已接单"),
     REJECTED(4, "已拒单"),
     REJECTED_REFUND(5, "拒单退款"),

     CANCEL_BY_USER_UNPAID(15, "用户未支付取消"),
     CANCEL_BY_USER(6, "用户取消"),
     CANCEL_BY_USER_REFUND(7, "用户取消退款"),

     CANCEL_BY_ADMIN(8, "运营平台取消"),
     CANCEL_BY_ADMIN_REFUND(9, "运营平台取消并退款"),

     SERVED(10, "已服务"),
     SERVED_TIMEOUT(14, "已服务用户未确认超时"),
     SERVED_TIMEOUT_CONFIRM(20, "超时自动确认(已服务后,用户没确认)"),

     EXCEPTION_TIMEOUT(11, "商家未确认超时"),
     EXCEPTION_TIMEOUT_SERVED(12, "商家未确认超时后台设置为已服务"),

     COMPLAINING(13, "投诉中"),
     COMPLA_FAILURE(30, "投诉失败,运营方确认完成"),
     COMPLA_REFUND(16, "投诉成功,退款"),
     COMPLA_REFUND_SUCCESS(40, "投诉成功,退款成功");


     private int key;
     private String value;

     HomeServiceOrderStatus(int key, String value) {
         this.key = key;
         this.value = value;
     }

     public int key() {
         return key;
     }

     public String value() {
         return value;
     }

     @Override
     public String toString() {
         return String.valueOf(key);
     }

	public static void main(String[] args) {
		for (HomeServiceOrderStatus n : HomeServiceOrderStatus.values()) {
			System.out.println(n.key + " " + n.value);
			System.out.println(n);
		}

		System.out.println(HomeServiceOrderStatus.SUCCESS);
		System.out.println(HomeServiceOrderStatus.UNPAID);
	}
}
