
public class If_dowhile1 {

	public static void main(String[] args) {
		/* ���빮��
		  ������ 6�� �߿��� 35�̻� ��� ���ڸ� ����ϼ���!!!!
		 */
     int dw = 1; 
     int total; 
     	do {
     		total=6*dw;
     		if(total > 35) {
     		//System.out.print(total+" ");
     		}
     
     		dw++;
     		}while (dw<10);
 
     	
     	/*���빮��
     	 * 14���� 27���� ���� �� ¦������ ��� ���Ͽ� 
     	 * ���� ������� ����ϼ���
     	 */
          int aa =14;
          int toto=0;
          do {
        	     if(aa% 2 == 0 ) {
        	    	 toto=toto+aa;
        	     }
          aa++;
          }while (aa<28);
          System.out.print(aa+" ");
     	
     	
	}
	}


