
public class For2 {

	public static void main(String[] args) {
		int a; //for�� �ʱⰪ
		int b=2; //���꿡 ����� ���� 
		int c; //������ ����� ���
		for(a=1;a<=9;a++) {
			c=b*a; //������� �۾�
			//System.out.print(c+","); //����� ������� ���
		}
		/*
		���빮��
		���� ������� ���� �ڵ带 �ۼ��ϼ���.
		45,40,35,30,25,20,
		*/
		int aa; //for���� ��
		int bb=5; //5��� ��
		int cc; //��� �� 
		for(aa=9;aa>=4;aa--) {
			cc=aa*bb;
		//	System.out.print(cc+",");
		}

	/*
	 ���빮��
	 ���� ������� Ȯ�� �� �ڵ带 �����Ͽ� ����ϼ���.
	 11,22,33,44,55,66,77,88,99,*/
		
		int q;
		int w=11;
	    int e;
	    for(q=1;q<10;q++) {
	    	e=q*w;
	    	System.out.print(e+",");
	    }
	}
}
