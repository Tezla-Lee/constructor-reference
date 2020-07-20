package classpart;

public class ShoppingTest {

	public static void main(String[] args) {

		Shopping shopping = new Shopping();
		
		shopping.address = "서울시 영등포구 여의도동 20번지";
		shopping.articleNumeber = "PD0345-12";
		shopping.orderDate = "2019년 7월 21일";
		shopping.userID = "abc123";
		shopping.userName = "홍길순";
		shopping.orderNumber = 201907210001L;
		
		System.out.println("주문 번호 : " +shopping.orderNumber);
		System.out.println("주문자 아이디 : " + shopping.userID);
		System.out.println("주문 날짜 : " + shopping.orderDate);
		System.out.println("주문자 이름 : " + shopping.userName);
		System.out.println("주문 상품 번호 : " + shopping.articleNumeber);
		System.out.println("배송 주소 : " + shopping.address);
	}

}
