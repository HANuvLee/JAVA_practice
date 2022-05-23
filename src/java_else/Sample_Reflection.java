package java_else;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * 리플렉션은 구체적인 클래스 타입을 알지 못하더라도 그 클래스의 메서드, 타입, 변수들에 접근할 수 있도록 해주는 자바 API이다.
 * 컴파일 시간이 아닌 실행 시간에 동적으로 특정 클래스의 정보를 추출할 수 있는 프로그래밍 기법이다.
 * 동적으로 클래스를 사용해야할 때 필요하다.
 * 다시 말해 작성 시점에는 어떠한 클래스를 사용해야 할지 모르지만 런타임 시점에서 클래스를 가져와서 실행해야하는 경우 필요.
 */

class ReflectionTest {
	  private String name;
	  private String gender;
	  private Tool use;

	  public enum Tool{
	    INTELLIJ, ECLIPSE
	  }
	  
	  public ReflectionTest() { 
	  
	  }
	  
	  private ReflectionTest(Tool use) { //private 생성자
	    setUse(use);
	    System.out.println("Tool : " + getUse());
	  }
	  
	  private void setNameAndUse(String name, Tool use) { //private 메소드
	    setName(name);
	    setUse(use);
	  }
	  
	  public Tool getUse() {
	    return use;
	  }

	  public void setUse(Tool use) {
	    this.use = use;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getGender() {
	    return gender;
	  }

	  public void setGender(String gender) {
	    this.gender = gender;
	  }
	}
  
public class Sample_Reflection {

	public static void main(String[] args){
		/*
		ReflectionTest 객체 가져오기 3가지 방법 => 클래스 파일의 정보를 얻기 위한 자바에서 제공하는 API가 있다. 바로 'java.lang.class'이며 이를 이용하여 클래스의 객체를 받는다.
		1 - Class refClass1 = ReflectionTest.class; ==>  class를 붙이는 이 방법은 해당 클래스를 바로 참조

		2 - ReflectionTest reflectionTest = new ReflectionTest();  ==> 객체 생성 후, getClass()라는 메서드를 이용하는 방법
			Class refClass2 = reflectionTest.getClass();
		
		***1번과 2번 방법이 좀 더 명시적이며 3번 방법은 예외처리같은 동적 코드를 작성 시 더 낫다***
		3 - try {
				Class refClass3 = Class.forName("java_else.ReflectionTest"); ==> forName() 메서드를 이용하여 괄호 안에 기술된 클래스를 로드하는 방법
			} catch (Exception e) {
				e.printStackTrace();
			}
		*/
		
		 Class refClass = null;

	      try {
	      	refClass = Class.forName("java_else.ReflectionTest");
	      } catch (ClassNotFoundException e) {
	      	e.printStackTrace();
	      }

		  /*객체 생성을 위한 생성자 정보 가져오기*/
		   /*생성자의 정보를 가져오는 메서드*/
		   /*  getConstructors() : 해당 클래스에 public으로 선언된 모든 생성자를 배열의 형태로 반환한다.*/
		   /*  getDeclaredConstructors() : 해당 클래스에 선언된 모든 생성자를 배열의 형태로 반환한다. 여기에는 private으로 선언된 생성자도 포함된다.*/
	      System.out.println("------------------getConstructors() 메서드------------------");
	      Constructor[] refConstructors = refClass.getConstructors();
	      for(int i=0; i<refConstructors.length; i++) {
	        System.out.println(refConstructors[i].toString());
	      }
	    
	      System.out.println("------------------getDeclaredConstructors() 메서드------------------");
	      Constructor[] refDecConst = refClass.getDeclaredConstructors(); // =>getDeclaredConstructors()로 접근할 경우, private으로 선언된 생성자에도 접근
	      for(int i=0; i<refDecConst.length; i++) {
	      	System.out.println(refDecConst[i].toString());
	      }
	      
	      /*메서드 정보 가져오기*/
	       /*Class 클래스에서 제공하는 메서드*/
		   /*  getMethods() : public으로 선언된 모든 메서드 목록과 해당 클래스에서 상속받은 메서드에 접근한다.
	       /*  getDeclaredMethods() : 해당 클래스에서 선언된 메서드 정보를 반환한다. 당연히 여기에는 private으로 선언된 메서드도 포함된다.*/
	      System.out.println("------------------getMethods() 메서드------------------");
	      Method[] refMethod = refClass.getMethods();
	      for(int i=0; i<refMethod.length; i++) {
	        System.out.println(refMethod[i].toString());
	      }

	      System.out.println("------------------getDeclaredMethods() 메서드------------------");
	      Method[] refDecMethod = refClass.getDeclaredMethods(); //getDeclaredMethods()로 접근할 경우에는 setNameAndUse()라는 private으로 선언된 메서드에 접근
	      for(int i=0; i<refDecMethod.length; i++) {
	      	System.out.println(refDecMethod[i].toString());
	      }
	      
	      /*변수 정보 가져오기*/
	       /*Class 클래스에서 제공하는 메서드*/
		   /*  getFields() : public으로 선언된 변수 목록을 Field 타입의 배열로 반환한다.
		   /*  getDeclaredFields() : 해당 클래스에서 정의 된 모든 변수 목록을 배열의 형태로 반환한다.*/
	      System.out.println("------------------getFields() 메서드------------------");
	      Field[] refFields = refClass.getFields(); 
	      for(int i=0; i<refFields.length; i++) {
	        System.out.println(refFields[i].toString());
	      }
	        
	      System.out.println("------------------getDeclaredFields() 메서드------------------");
	      Field[] refDecFields = refClass.getDeclaredFields();
	      for(int i=0; i<refDecFields.length; i++) {
	      	System.out.println(refDecFields[i].toString());
	      }
	      //ReflectionTest 클래스에 선언된 변수들은 전부 private이었기 때문에 getDeclaredFields() 메서드는 모든 변수의 정보를 추출하지만,
	      //getFields() 메서드는 아무것도 추출해내지 못하는 것을 볼 수 있다.
	}

}
