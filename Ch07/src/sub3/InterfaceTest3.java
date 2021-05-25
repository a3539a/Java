package sub3;

/**
 * 날짜 : 2021/05/23
 * 이름 : 김승용
 * 내용 : 자바 인터페이스 실습하기
 */
public class InterfaceTest3 {

	public static void main(String[] args) {
		
		// 인터페이스 - 객체간 결합도 완화
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		
	}
	
}
