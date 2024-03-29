
public class Class4 {

	public static void main(String[] args) {
		Member mb = new Member();
		// 객체: Member
		// mb: 인스턴스
		// new Member(); : 메모리에 인스턴스명을 생성하여 사용할 수 있도록 함
		mb.user_age = 33;
		//System.out.println(mb.user_age);
		int total = 25 * mb.user_agree;
		//System.out.println(total);

		final int agree = mb.user_agree;
		// Member 인스턴스 필드값을 로드함->agree필드 상수값으로 전달
		mb.user_agree = 80; // 메모리에 등록된 필드명에 해당되는 값을 변경함
		//System.out.println(mb.user_agree);
		//System.out.println(agree);

		/* 일반 클래스 메소드 부분 
		 * 일반 클래스 메소드 사용 시 별도의 객체 및 인스턴스를 만들 필요 없음
		 * 왜? static 자체가 메모리 인스턴스를 사용한다는 뜻*/
		//coupon.events();
		mb.member_events();

	}
}
class Member { // 클래스
	String user_name; // 변수 필드명(user_name)생성
	int user_age;
	int user_level;
	int user_agree = 6; // 변수 필드명(user_agree)에 필드 값(1)을 선언
	public void member_events() {
		coupon.events(); //★클래스에 대한 메소드를 바로 호출 가능
		//단, events라는 메소드에 변수 필드 및 변수 필드값을 class에 선언하게되면
		//그 때는 객체+인스턴스를 생성해야만 로드 됨
	}
}

class coupon {
	public static void events() {
		int cp = 30;
		System.out.println(cp);
	}
}

/*
 * 하나의 Project중 서로 다른 package라고 한번 사용한 Class명은 다른 곳에서 사용하실 수 없습니다.
 */