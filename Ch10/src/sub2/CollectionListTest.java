package sub2;

import java.util.ArrayList;
import java.util.List;

import sub1.Apple;

/**
 * 날짜 : 2021/05/26
 * 이름 : 김승용
 * 내용 : 자바 콜렉션 리스트 실습하기
 */
public class CollectionListTest {

	public static void main(String[] args) {
		
		// List 생성
		List<Integer> list1 = new ArrayList<>();
		
		// List 데이터 저장
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);
		list1.add(1, 3);
		
		for(int num : list1) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		List<String> list2 = new ArrayList<>();
		list2.add("김유신");
		list2.add("김춘추");
		list2.add("장보고");
		list2.add("강감찬");
		list2.add("이순신");
		
		for(String person : list2) {
			System.out.print(person+" ");
		}
		System.out.println();

		Apple a1 = new Apple("한국", 1000);
		Apple a2 = new Apple("중국", 2000);
		
		List<Apple> list3 = new ArrayList<>();
		
		list3.add(a1);
		list3.add(a2);
		list3.add(new Apple("일본", 3000));
		
		// 한국 사과 출력
		Apple apple= list3.get(0);
		apple.toString();
		
		// 일본 사과 출력
		list3.get(2).toString();
		
		// 중국 사과 출력
		list3.get(1).toString();
		
	}
	
}

