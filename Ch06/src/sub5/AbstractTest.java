package sub5;

/**
 * ��¥ : 2021/05/25
 * �̸� : ��¿�
 * ���� : �߻� Ŭ���� �ǽ��ϱ�
 */
public class AbstractTest {

	public static void main(String[] args) {
		
//		Unit unit = new Unit();
		Unit marine = new Marine();
		Unit zealot = new Zealot();
		Unit zergling = new Zergling();
		
		marine.move();
		zealot.move();
		zergling.move();
		
		marine.attack();
		zealot.attack();
		zergling.attack();
		
		
	}
	
}
