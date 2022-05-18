package java_else;
/*
 * Java 8 버전부터 함수형 프로그래밍을 지원하기 위해 람다(Lambda)와 스트림(Stream)이 도입. 
 * 람다와 스트림을 사용하면 유행하는 함수형 프로그래밍 스타일로 자바 코드를 작성가능.
 * 물론 람다와 스트림을 사용하여 작성한 코드를 일반 스타일의 자바코드로 바꾸어 작성하는 것이 불가능하지는 않다. 
 * 달리 말하면 람다와 스트림 없이도 자바 코드를 작성하는데 어려움이 없다는 뜻이다. 
 * 하지만 그럼에도 불구하고 람다와 스트림을 사용하는 이유는 작성하는 코드의 양이 줄어들고 읽기 쉬운 코드를 만드는데 유리하기 때문이다.
 */

@FunctionalInterface
interface Calculator{
	int sum(int a, int b);
	//int mul(int a, int b);  mul 메서드를 추가하면 컴파일 에러가 발생한다.
	//Calculator 인터페이스의 메서드가 1개 이상이면 람다함수를 사용할 수 없다. 그래서 람다 함수로 사용할 인터페이스는 다음처럼 @FunctionalInterface 어노테이션을 사용하는 것이 좋다. 
	//@FunctionalInterface 는 두 번째 메서드를 허용하지 않는다. 
}

class MyCalculator implements Calculator{

	@Override
	public int sum(int a, int b) {
		
		return a + b;
	}
	
}

public class Sample_Lamda {

	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		int result = mc.sum(3, 4);
		System.out.println(result);
		
		//괄호 사이의 int a, int b는 Calculator 인터페이스의 sum 함수의 입력항목에 해당하고 -> 뒤의 a+b 가 리턴값에 해당한다. 
		//이렇게 람다함수를 사용하면 MyCalculator와 같은 실제 클래스 없이도 Calculator 객체를 생성할 수 있다.
		Calculator mc2 = (int a, int b) -> a + b;
		int result2 = mc2.sum(3, 4);
		System.out.println(result2);

	}

}
