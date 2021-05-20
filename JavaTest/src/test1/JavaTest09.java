package test1;

/**
 * 날짜 : 2021/05/20
 * 이름 : 김승용
 * 내용 : 자바 다이아몬드 연습문제
 */
public class JavaTest09 {

	public static void main(String[] args) {
		int count = 0;
		
		for(int i=1; i<=9; i++) {
			
			if(i <= 5) {
				count++;
			}else {
				count--;
			}
			
			for(int j=1; j<=5-count; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=2*count-1; k++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}






