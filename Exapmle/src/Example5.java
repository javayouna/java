
public class Example5 {

	public static void main(String[] args) {
	/*
	 응용문제5
	 다음 코드를 보고 while문으로 변환하세요.
	 int sum=0;
	 int i;
	 
	 for(i=1;i<=12;i++){
	 if(i%2==0){
	 sum=i+sum;{
	 }
	 }
	  System.out.print("1부터 12까지 짝수의 합 =" +sum);
	 
	 
	 */
			
		int i=1;
		int sum=0;
		
		while(i<=12){
			if(i%2==0) {
				sum=sum+i;}
			i++;
		}
				System.out.print("1부터 12까지 짝수의 합 = " +sum);
			
		
		
		
	}

}
