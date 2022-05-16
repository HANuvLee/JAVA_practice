package objectOriented;

/*
 * ====================기본타입에서의 작동방식====================
 * 기본형은 Stack영역에 저장
 * 자바에서 Call by value 수행 시 인자값을 받은 메소드에서 값을 복사한 후 새 지역변수에 저장
 * Method2는 Method1의 변수를 사용한 것이 아니라, 자신이 새롭게 생성한 지역 변수에 Method1의 변수 이름과 변수 값을 복사하여 사용.
 * 따라서 Method2에서 아무리 값을 바꾸어도 Method1에게는 아무런 영향을 미치지 않는다.
 * 즉 Method1 & Method2 a, b는 이름만 같을 뿐 다른주소를 가지고 있다!
 */
public class CallByValue {
	
	public void method_1() {
		int a = 10;
		int b = 5;
		System.out.println("Before Call Method2 : ( a = " + a + ", b = " + b + " )");
		method_2(a, b);
		System.out.println("After Call Method2 : ( a = " + a + ", b = " + b + " )");
	}
	
	public void method_2(int a, int b) {
		a = 20;
		b = 10;
		System.out.println("Inside Method2 : ( a = " + a + ", b = " + b + " )");
	}
	
	//기본타입이 아닌 참조타입을 인자로 받는 메서드 실행
	public void method_3() {
		String a = "Ann";
		String b = "Nick";
		System.out.println("Before Call Method2 : ( a = " + a + ", b = " + b + " )");
		method_4(a, b);
		System.out.println("After Call Method2 : ( a = " + a + ", b = " + b + " )");
	}
	
	public void method_4(String a, String b) {
		a = "Nick";
		b = "Ann";
		System.out.println("Inside Method2 : ( a = " + a + ", b = " + b + " )");
	}

	public static void main(String[] args) {
		CallByValue method1 = new CallByValue();
		CallByValue method3 = new CallByValue();
		method1.method_1(); // method_1의 값은 바뀌지 않는다.!! 자바가 CALL BY VALUE이기 때문에!!
		System.out.println("==================기본타입이 아닌 참조타입의 인자값을 받는 메서드 실행==================");
		method3.method_3(); // method_3의 값 또한 바뀌지 않는다!!
	}

}
