package sub5;

/**
 * 날짜 : 2021/05/25
 * 이름 : 김승용
 * 내용 : 추상 클래스 실습하기
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
