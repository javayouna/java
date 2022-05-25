
public class For1 {

	public static void main(String[] args) {
		//반복문:데이터 일괄 입력, 출력이 가능한 문법
		
		int z=1;
		//z++; //+1 증가 :출력 후 +1증가
		//z--; //-1 감소 :출력 후 -1감소
		//++z; //+1 증가 :+1증가 후 출력
		//--z; //-1 감소 :-1감소 후 출력
		//System.out.println(z);
		for(int a=0; a<10; a++) { //for(초기값;범위값;증가 또는 감소){ ;는 사용하지 않음
			//System.out.println(a);
		}
        int b;
        for(b=5;b<=10;b++) {
        	//System.out.println(b);
        }
        int c; //내림차순!!!!
        for(c=10;c>3;c--) { //주의사항 c<3 이면 0~-음수까지 전부 찍히는 오류
	       //System.out.println(c);
        }
        //응용문제 20~27까지 출력
        int f;
        for(f=20;f<=27;f++) {
        	//System.out.print(f);
        }
	    //응용문제 39~21까지 출력
        int g;
        for(g=39;g>=21;g--) {
        	//System.out.print(g+",");
        }
	   //응용문제 1~10까지 숫자 출력
        int aa;
        int bb=10;;
        for(aa=1;aa<=bb;aa++) {
        //System.out.print(aa+",");
        }
	    /*응용문제 변수 2개 이용, 다음 데이터 출력
        55~4까지 출력 내림차순     
	}  */
	    int yy;
	    int kk=4;
	    for(yy=55;yy>=4;yy--) {
	    	System.out.print(yy+",");
	    }
	
	
	}
	
}
