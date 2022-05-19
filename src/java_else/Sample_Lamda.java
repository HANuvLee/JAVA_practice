package java_else;
/*
 * Java 8 버전부터 함수형 프로그래밍을 지원하기 위해 람다(Lambda)와 스트림(Stream)이 도입. 
 * 람다와 스트림을 사용하면 유행하는 함수형 프로그래밍 스타일로 자바 코드를 작성가능.
 * 물론 람다와 스트림을 사용하여 작성한 코드를 일반 스타일의 자바코드로 바꾸어 작성하는 것이 불가능하지는 않다. 
 * 달리 말하면 람다와 스트림 없이도 자바 코드를 작성하는데 어려움이 없다는 뜻이다. 
 * 하지만 그럼에도 불구하고 람다와 스트림을 사용하는 이유는 작성하는 코드의 양이 줄어들고 읽기 쉬운 코드를 만드는데 유리하기 때문이다.
 */

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

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
		System.out.println("result => " + result);
		
		//괄호 사이의 int a, int b는 Calculator 인터페이스의 sum 함수의 입력항목에 해당하고 -> 뒤의 a+b 가 리턴값에 해당한다. 
		//이렇게 람다함수를 사용하면 MyCalculator와 같은 실제 클래스 없이도 Calculator 객체를 생성할 수 있다.
		Calculator mc2 = (int a, int b) -> a + b;
		int result2 = mc2.sum(3, 4);
		System.out.println("result2 => " + result2);
		
		/* (int a, int b)는 인터페이스에 이미 입출력에 대한 타입이 정의되어 있으므로 입력값의 타입인 int는 생략이 가능
		 * 그리고 두 수를 더하여 그 결과를 리턴하는 함수 (a, b) -> a+b 는 Integer.sum(int a, int b)와 동일하기 때문에 다음과 같이 더 축약이 가능
		 * 어떤 클래스의 메서드를 사용할 때는 위와 같이 :: 기호를 사용하여 클래스와 메서드를 구분하여 표기 */
		Calculator mc3 = Integer::sum;
		int result3 = mc3.sum(3, 4);
		System.out.println("result3 => " + result3);
		
		/*
		 * 람다함수 인터페이스
		 * 인터페이스 생성 대신 함수형 프로그래밍을 위해 제공되는 인터페이스들을 사용하여 코들를 좀 더 축약
		 * 자바가 제공하는 BiFunction 인터페이스를 사용하면 Calculator인터페이스를 대신하여 작성 가능 */
		//BiFunction의 <Integer, Integer, Integer> 제네릭스는 순서대로 입력항목 2개, 출력항목 1개를 의미한다. 
		//그리고 BiFunction 인터페이스의 apply 메서드를 호출하면 람다함수 (a, b) -> a + b가 실행된다.
		BiFunction<Integer, Integer, Integer>mc4 = (a, b) -> a + b;
		int result4 = mc4.apply(3, 4); //sum이 아닌 apply 메서드를 사용용
		System.out.println("result4 => " + result4);
		
		//작성한 코드를 자세히 보면 입출력 항목의 타입이 모두 Integer로 동일하다는 것을 알 수 있다. 
		//이렇게 입출력 항목이 모두 동일할 경우에는 다음의 BinaryOperator를 사용하여 더 간단하게 표현 가능하다.
		BinaryOperator<Integer>mc5 = (a, b) -> a + b;
		int result5 = mc5.apply(3, 4); //sum이 아닌 apply 메서드를 사용용
		System.out.println("result5 => " + result5);

	}

}
