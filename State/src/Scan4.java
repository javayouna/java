import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
			System.out.println("입력할 내용을 적어주세요!");
		//String memo = a.next();	
			//next():스페이스바 입력까지만 적용
			//nextLine():스페이스바 포함 모두 입력 적용
	String memo = a.nextLine();
	System.out.println(memo);
	a.close(); //scanner 종료는 기본!
	
   String mid="park"; //String + int =%s
   int age=25; //숫자는 %d 
   //[중요사항]
   //%f : float,double
   //%t : date, time 시간, 날짜
   //%b : boolean (true,false)
   
	//System.out.println(mid+"님의 나이는"+age+"입니다.");
   //printf: f는 format을 뜻함
System.out.printf("%s님의 나이는 %s 입니다.",mid,age);
	}


}
