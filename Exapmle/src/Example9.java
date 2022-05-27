import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 
		 * A학생에 대한 성적을 입력 받고 평균점수가 나오는 프로그램을 제작합니다. "점수를 입력하세요!" 라는 문구는 총 5번이 나오게 되며, 모든
		 * 점수를 합산하여 출력합니다.
		 *
		 * [추가기획] "입력하실 과목 수를 적어주세요:"라고 제일먼저 출력 후 해당 과목 수 만큼 반복문이 적용 되며,과목 수 만큼 평균값이 적용
		 * 되어야 합니다.
		 */

		/*
		 * Scanner bb = new Scanner(System.in);
		 * 
		 * double i = 0; double ii = 0; String msg = "점수를 입력하세요";
		 * 
		 * System.out.println("입력하실 과목의 숫자를 입력해주세요"); int a = bb.nextInt();
		 * 
		 * do { System.out.println(msg); int usepw = bb.nextInt(); // 기존코드 String usepw
		 * = bb.next(); ii = ii + usepw; // 기존코드 ii = ii + i;
		 * 
		 * i++; } while (i < a);
		 * 
		 * System.out.println("해당 점수의 평점은 : " + ii / a); if (ii / a >= 40) {
		 * System.out.println("합격입니다"); } else { System.out.println("재시험입니다"); }
		 * 
		 * bb.close();
		 */

		// 선생님 답
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 과목 수를 적어주세요: ");
		int subject =sc.nextInt();
		int w = 1;
		int user;
		int total = 0;
		while (w <=subject) {
			System.out.println("점수를 입력해 주세요: ");
			user = sc.nextInt();
			total = total + user;
			w++;
		}
		int avg = total /subject; // double avg=(double)(total)/subject; 이렇게 하면 소숫 점까지 다 나옴 
		String msg;
		if (avg < 40) {
			msg = "재시험입니다.";
		} else {
			msg = "합격입니다.";
		}

		System.out.println("최종 평균 점수는 " + avg + "이며," + msg);

		sc.close();
	
	
	
	}

}
