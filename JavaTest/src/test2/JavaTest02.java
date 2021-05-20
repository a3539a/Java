package test2;

/**
 * 날짜 : 2021/05/20
 * 이름 : 김승용
 * 내용 : 배열에서 최대 값 출력하기
 */
public class JavaTest02 {

	public static void main(String[] args) {
		
		int arr[] = {17,92,18,33,58,7,26,42};
		int maxNum = arr[0];
		
		for(int i = 0; i< 8;i++) {
			
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		System.out.println("배열 arr에서 가장 큰 수 : "+maxNum);
	}
}
