import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		/* 응용문제
		 * 해당 두개의 배열 데이터가 있습니다.각 배열별로 인덱스가 같은 번호를 더해서
		 * 짝수,홀수 인지를 배열 결과 데이터로 재설정 하십시오. 

			Adata = 5 17 19 22 33 
			Bdata = 1 2 3 4 5 
			Result = ["짝수","홀수","짝수","짝수","짝수"]
			*/
			
			int A1[][]={ {5,17,19,22,33},
					{1,2,3,4,5}
			};
			//A1[0][0]+A1[1][0] 
			//A1[0][1]+A1[1][1]
		int ea = A1[0].length; //배열에 있는 데이터 객체 수
		int ea2 = A1.length; //배열그룹 수
		
		int w=0; //큰 반복문 인덱스
		int total1=0; //각각의 값을 이관 받는 변수
		int total2=0;
		int newdata[]=new int[ea]; //새로운 배열 객체생성
		
		
		while(w<ea) { //큰 반복문 7바퀴 (배열 데이터 객체 수)
			int ww=0;
			while(ww<ea2){
			if(ww==0) {
				total1=A1[ww][w];
			}
			else {
				total2=A1[ww][w];
			}
			ww++;
			}
			//작은반복문 밖으로 나와서 첫번째 배열 값 + 두번째 배열 값
			newdata[w]=total1+total2; //새로운 배열 객체로 등록
		w++;
	}
		System.out.println(Arrays.toString(newdata));
}
}
