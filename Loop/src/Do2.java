
public class Do2 {

	public static void main(String[] args) {
		
		int a = 1; //�ݺ��� ���ʰ�
		int b = 9; //��� ���� �� ����ȵ�
		int c;
		do {
c=a*b;
//System.out.print(c+" ");
	  	a++;
	}while(a<10);
		
		
		
		/*���빮��
		 * ���� ������� ���� do~while������ �ڵ带 �ۼ��ϼ���.
		 * 35 45 55 65 75
		 */
		int aa = 3;
		int bb;
		do {
			bb=aa*10+5;
			System.out.print(bb+" ");
			aa++;
			}while(aa<=7);
}
}
