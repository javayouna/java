import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {

		// 빈배열 변수에 데이터가 있는 배열로 거스텀 방법
		int a[] = new int[3]; // 3개의 공간만 제공함
		int b[] = { 1, 2, 3, 4, 5, 6, 7 }; // 7개의 객체가 있는 상황

		// System.out.println(a);

		int ea = b.length; // b 배열안에 몇 개의 데이터 객체가 있는지
		// System.out.println(a.length);
		int a_ea = a.length;
		int w = 0; // 데이터는 0부터 시작하니까 0으로!
		int ct = 0;
		while (w < ea) {
			// System.out.println(b[w]);

			if (b[w] % 2 == 0 && ct <a_ea) { //if(b배열의 값중 짝수만 && 새로운 a 배열에 전체 객체 크기 만큼만)
				a[ct] = b[w];
				ct++; //조건 맞으면 인덱스 번호 +1씩 증가 시킨
			}
			w++;
		}
		System.out.println(Arrays.toString(a));

	}

}
