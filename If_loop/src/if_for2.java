
public class if_for2 {

	public static void main(String[] args) {
		//1~100���� ���� �� 80�̻��� ���ڸ� ���
		int f; 
		for(f=1;f<101;f++) {
			
			if(f >= 80) { //�ݺ����� if�� ���ٴ� ����.. �ݺ����ȿ��� ���� ���ϴ� �͸� �̰� ���� �� 
			//	System.out.print(f+" ");
			}
			
			
		}
		
		//200~300���� ���� �� 240 ���� ���ڸ� ����Ͻÿ�.
		
		int nu;
		for(nu=200;nu<301;nu++){
			
			if(nu<=240) {
			//	System.out.print(nu+" ");
			}
		}
		
		final int a = 5;
		int w;
		for(w=1;w<11;w++) {
			if(w % a ==0) {
		//		System.out.print(w+" ");
			}
		}
		
		
		//���빮�� ������ �� 2���� �ݺ��մϴ�. �� 2�� ����� �� 10�̻� ���ڸ� ����մϴ�.
		
		final int g=2;
		int ww;
		int total;
		for(ww=1;ww<=9;ww++){
			
			total=g*ww;
			if(total>10) {
		//	System.out.println(total); //
		}
		
		}	
		
		
		/*���빮��
		  ���� ������� ���� �ش� ���� ��� �ǵ��� �ڵ带 �����Ͻÿ�.
		  18, 36, 54, 72 
		 */
		
		final int aa=18;
		int bb;
		int sum;
		for(bb=1;bb<=9;bb++) {
			sum=aa*bb;
			if(sum<73) {
		//		System.out.print(sum+" ");
			}
		} //���� Ǭ ��
     
		 int p;
		 int total3;
		 for(p=1;p<10;p++) {
			 total3=p*9;
			 if(p%2==0){
			 //System.out.println(total3+" ");
		 }
		 } 
		
		/* ���빮��
		 * ���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 �����Ͻÿ�.
		 1~20 ������ ���� �Դϴ�.
		 6 14 17 19
		 */
		 int k;
		 for(k=1;k<21;k++) {
			 if(k==6||k==14||k==17||k==19){
			 System.out.print(k+" ");
		 }
		 }
	
	
	
	
	
	
	}
	
	
	
}


