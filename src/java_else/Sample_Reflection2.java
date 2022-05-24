package java_else;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import java_else.ReflectionTest.Tool;

/*
 * 일반적으로 객체 생성은 코더가 클래스와 메서드를 직접 작성하면 컴파일 되어 메모리에 올라가는 것을 전제로 한다.
 * 이유는 정적언어인 자바는 실행 전 모습이 어느 정도 결정되어야 하기 때문이다.
 * 하지만 리플렉션을 이용하면 런타임, 즉 프로그램이 실행되고 있는 동안에도 클래스 정보를 알아내는 것이 가능하며
 * 이는 바로 동적으로 그것을 실행(동작 및 수정)할 수 있게 된다.
 */
public class Sample_Reflection2 {
	/*
	 * reflection1에서는 생성자의 정보를 복수로 가져왔으며 이번에는 필요한 생성자 하나에 접근하여 객체를 생성하며 
	 * 생성자와 메서드를 동적으로 활용해본다.
	 */

	public static void main(String[] args) {
		Class refClass = null;
		String[] nameArr = { "홍길동", "임꺽정", "피치", "라이언" }; // 1.에서 추출된 메서드 중 setName메소드의 접근을 위해 인수로 넣을 nameArr배열 선언
		try {
			refClass = Class.forName("java_else.ReflectionTest");
			Method[] refMethod = refClass.getDeclaredMethods();

			/* 메서드를 동적으로 이용하는 방법 */
			/* 1. setName메서드를 찾는다. */
			for (int i = 0; i < refMethod.length; i++) {
				if (refMethod[i].getName().equals("setName")) {
					System.out.println("-----------setName 발견 -----------");
					System.out.println(refMethod[i].getName()); // 전과 달리 getName 메서드를 사용하여 메서드들 이름만 추출 , toString() -> getName()
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		/*
		 * 2. setName()메서드가 Private인지 public인지 확인, 만약 private이면 setAccessible(true)를 먼저
		 * 추가 리플렉션에서 메서드를 동적으로 실행하기 위해서는 invoke(obj, args) 메서드를 사용하며 매개변수 2개가 필요하다. 
		 * obj는 메서드(setName())를 실행하기 위한 객체이고, args는 메서드(setName())를 실행하기 위해 필요한 매개변수이다.
		 */
		try {
			ReflectionTest reflectionTest = new ReflectionTest(); // invoke()를 실행하는데 필요한 객체 생성
			refClass = Class.forName("java_else.ReflectionTest");
			Method[] refMethod = refClass.getDeclaredMethods();
			try {
				for (int i = 0; i < refMethod.length; i++) {
					if (refMethod[i].getName().equals("setName")) {
						for (int j = 0; j < nameArr.length; j++) {
							System.out.println("-----------setName 실행 -----------");
							refMethod[i].invoke(reflectionTest, nameArr[j]); // 객체와 매게변수를 넣고 실행

							System.out.println("-----------getName 실행 -----------");
							System.out.println(reflectionTest.getName());
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		/* 생성자를 이용한 객체 생성 */
		 /* 생성자 하나에 접근하여 객체 생성 */
		 /*  getConstructor(parameterTypes) : public으로 선언된 생성자에 접근 (단일 매게 변수 필요).
		  *  getConstructor(new Class[]{parameterTypes, parameterTypes,...}) : public으로 선언된 생성자에 접근 (복합 매게 변수 필요) 
		  *  getDeclaredConstructor(parameterTypes) : 모든 생성자에 접근  (단일 매게 변수 필요). 단, setAccessible(true) 필요.
		  */
		try {
			Constructor refDecConst = refClass.getDeclaredConstructor(Tool.class); // 매개변수 타입이 Tool은 enum 타입이므로 메소드() 안에 Tool.class를 넣어서 접근
			refDecConst.setAccessible(true); // getDeclaredConstructor()는 private에 접근할 수 있지만 그런 경우에는 setAccessible(true)라는 메서드를 추가로 작성.
			refDecConst.newInstance(Tool.ECLIPSE);// newInstance(initargs)라는 메서드를 이용하여 객체를 생성
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
