package test1;

/**
 * 날짜 : 2021/05/20
 * 이름 : 김승용
 * 내용 : 자바 연산자 연습문제
 */
public class JavaTest04 {

	public static void main(String[] args) {
		
		int x = 4;
		int y = 2;
		int z;

		z = x + y;
		System.out.println("x + y ="+z);
		
		z = x - y;
		System.out.println("x - y ="+z);
		
		z = x * y;
		System.out.println("x * y ="+z);
		
		z = x / y;
		System.out.println("x / y ="+z);
		
		z = (x + y) * (x - y);
		System.out.println("(x + y) * (x - y) ="+z);
		
		z = (x * y) + (x / y);
		System.out.println("(x * y) + (x / y) ="+z);
		
		
	}
}
