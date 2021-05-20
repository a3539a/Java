package sub1;

/**
 * 날짜 : 2021/05/20
 * 이름 : 김승용
 * 내용 : 자바 메서드(함수) 실습하기
 */
public class MethodTest {

	// main method : 자바 프로그램 시작점
	public static void main(String[] args) {
	
		//메서드 호출
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 :"+y1);
		System.out.println("y2 :"+y2);
		System.out.println("y3 :"+y3);
		
		// 메서드 호출
		System.out.println("1 부터 10 까지의 합 : "+sum(1,10));
		System.out.println("1 부터 100 까지의 합 : "+sum(1,100));
		System.out.println("1 부터 1000 까지의 합 : "+sum(1,1000));
	}// main method end
	
	// 메서드 정의 : 일련의 코드로직을 모듈화 한것
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
	}
	
	public static int sum(int start, int end) {
		
		int sum = 0;
		
		for(int k =start; k<=end; k++) {
			sum += k;
		}
		
		
		return sum;
	}
}











