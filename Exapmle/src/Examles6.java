
public class Examles6 {

	public static void main(String[] args) {
		/* 
		 * ���빮��6
		 * 1~10���� ���������� �����ϴ� �ݺ����� �ֽ��ϴ�.
		 * ��, 1~5������ ��� ���� ���ϰ�, 6~10������ ���մϴ�.
		 * �ش� �ΰ��� ���� ���Ͽ� ���� ���� ū��, ���Ѱ��� ū����
		 * ����� ����ϼ���.
		 */
		
		int i=1;
		int sum=0; //���Ұ� 
		int sum2=1; //���Ұ� 
		for(i=1;i<=10;i++) {
				if(i<6) {
				sum2=i*sum2;
				}
					if(5<i){
					sum=sum+i;
					}
				}		
		
				if(sum2<sum) {
				System.out.println("���� ���� �� Ů�ϴ�");
				}
				else{										//else if ���ٰ� �̰� ����						
				System.out.println("���� ���� �� Ů�ϴ�."); 	//else���� �����ϴ�. ��� �ᵵ ��
				}
		

	}

}
