package sub4;

/**
 * ��¥ : 2021/05/26
 * �̸� : ��¿�
 * ���� : auto-boxing, auto-unboxing �ǽ��ϱ�
 */
public class AutoBoxingTest {

	public static void main(String[] args) {
		
		// Auto-Boxing(�⺻Ÿ�� -> Wrapper)
		Integer w1 = 1;
		Double  w2 = 2.13;
		Boolean w3 = false;
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		
		// Auto-unBoxing(Wrapper -> �⺻Ÿ��)
		int 	var1 = w1;
		double 	var2 = w2;
		boolean var3 = w3;
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		
	}
	
}
