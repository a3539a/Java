package test1;

/**
 * 날짜 : 2021/05/20
 * 이름 : 김승용
 * 내용 : 자바 피라미드 연습문제
 */
public class JavaTest08 {

	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 0; i < n; i++) {
			
			for(int j = n-1; j>i;j--) {
				System.out.print(" ");
			}
			
			for(int j = 0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
