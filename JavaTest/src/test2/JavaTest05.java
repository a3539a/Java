package test2;

/**
 * 날짜 : 2021/05/20
 * 이름 : 김승용
 * 내용 : 배열 선택 정렬하기
 * 
 * 개발과정
 * 참조 ) https://www.youtube.com/watch?v=OGzPmgsI-pQ
 * 1) 배열의 2번 째 원소를 1번 째 원소와 비교하여 작으면 1번 째 원소와 자리 교환
 * 2) 배열의 3번 째 원소를 2번 쨰 원소와 비교하여 작으면 2번 째 원소와 자리 교환
 * 	  그리고 다시 1번 째 원소와 비교하여 작으면 1번 째 원소와 자리 교환
 * 3) 위와 같은 과정을 반복 수행
 */
public class JavaTest05 {

	public static void main(String[] args) {
		
		int[] arr = {4,2,1,5,3};
		
		for(int j=1; j<arr.length; j++) {
			
			int key = arr[j];
			int i = j -1;
			
			while(i>=0 && arr[i]>key) {
				
				arr[i+1] = arr[i];
				i = i -1;
			}
			arr[i+1] = key;
		}
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}
}















