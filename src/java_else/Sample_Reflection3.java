package java_else;

import java.lang.reflect.Field;

/*
 * 3번째에서는 변수의 정보를 얻은 후, 그것의 값을 동적으로 다루는 방법에 대해 연습해본다.
 * 리플렉션을 이용하면 코드를 좀 더 유연하게 만들 수 있습니다.
 * 하지만 setAccessible(true)와 같은 메서드의 사용으로 인해 캡슐화를 깨뜨리는 일이 생길 수 있다.
 * 또, 리플렉션이라는 기능이 사용하는 JVM의 Perm 메모리는 용량의 한계가 있으므로
 * 코드 설계 시 위에 위의 특징들을 고려하여 설계한다.
 */
public class Sample_Reflection3 {

	public static void main(String[] args) {
		try {
			 ReflectionTest reflectionTest = new ReflectionTest(); // get(), set()을 위한 객체 생성
			 Class refClass = Class.forName("java_else.ReflectionTest");
			 Field[] refField = refClass.getDeclaredFields(); //변수정보 추출 방법 2가지 getFields()와 getDeclaredFields() 중 getDeclaredFields() 사용
			 
			 try {
				for(int i=0; i<refField.length; i++) {
					if(refField[i].getName().equals("name")) {
						System.out.println("name 발견 !!");
						Field field = refClass.getDeclaredField(refField[i].getName()); //field에 할당
						field.setAccessible(true); //변경하려는 name 변수가 private이므로 setAccessible(true)설정
						
						field.set(reflectionTest, "Thisisnew"); // 값 설정
			            Object fieldValue = field.get(reflectionTest);// 값 받아오기, get() 메서드는 반환형이 Object가 되도록 하여 다시 받아오게끔 작성
			            System.out.println(fieldValue);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
