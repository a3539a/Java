package sub2;

// final 클래스는 상속 할 수 없다.
public class BBB extends AAA {

	@Override
	public final void method1() {
		System.out.println("BBB - method1...");
	}
	
	// Overload
	public void method2(int a) {
		System.out.println("BBB - method2...");
	}
	
	// Overload
	public void method3() {
		System.out.println("BBB - method3...");
	}
}
