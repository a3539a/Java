package sub2;

public class CCC extends BBB {

	/*
	 * 부모 클래스 BBB - method1은 final 선언으로 Override 할 수 없다.
	@Override
	public void method1() {
		System.out.println("CCC - method1...");
	}
	*/
	
	@Override
	public void method2() {
		System.out.println("CCC - method2...");
	}
	
	@Override
	public void method3(int a) {
		System.out.println("CCC - method3...");
	}
}
