
public class App {

	public static void main(String[] args) {
		// 합산 계산공식 중 작은 값을 출력하십시오.

		int a = 25 + 31 * 4 + 12;
		int b = 15 * 3 + 9 + 14;

		if (a < b) {
			System.out.println("a가 b보다 작습니다");
		}

		else {
			System.out.println("b가 a보다 작습니다");
		}
	
	/* 해당값을 2진수로 짝수, 홀수 확인하기 */

	int c = b % 2; // % 사용시 0 또는 1로 나머지 값 출력
	if(c==0) {
	System.out.println("짝수 입니다.");
	}
	
	else {
		System.out.println("홀수 입니다.");
	}
	}
}

