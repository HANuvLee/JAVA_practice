package java_else;

/*
 * 싱글톤은 단 하나의 객체만을 생성하게 강제하는 패턴이다. 
 * 즉, 클래스를 통해 생성할 수 있는 객체는 Only One, 즉, 한 개만 되도록 만드는 것이 싱글톤이다.
 */

// Singleton 클래스의 생성자에 private 키워드로 다른 클래스에서 Singleton 클래스의 생성자로의 접근을 막았다. 
// 이렇게 생성자를 private 으로 만들어 버리면 다른 클래스에서 Singleton 클래스를 new 를 이용하여 생성할 수 없게 된다.
class Singleton{
	/*
	 * Singleton 클래스에 one 이라는 static변수를 두고 getInstance메소드에서 one값이 null인 경우에만 객체를 생성하도록 하여 one 객체가 딱 한번만 만들어지도록 했다.
	 * 최초 getInstance가 호출되면 one이 null이므로 new에 의해서 객체가 생성이 된다.
	 * 이렇게 한번 생성이 되면 one은 static 변수이기 때문에 그 이후로는 null이 아니게 된다. 
	 * 그런 후에 다시 getInstance 메소드가 호출되면 이제 one은 null이 아니므로 이미 만들어진 싱글톤 객체인 one을 항상 리턴한다.
	 */
	private static Singleton one; 
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() { 
		if(one == null) {
			one = new Singleton();
		}	
		return one; 
	}
}

public class SingletonPattern {

	public static void main(String[] args) {
//	Singleton singleton = new Singleton();  객체 생성 시 컴파일 에러 발생!!
	
//	getInstance라는 static메소드를 이용하여 Singleton 클래스의 객체를 생성 가능.
//	하지만 getInstance를 호출 할 때마다 새로운 객체가 생성되기 때문에 싱글톤이 아니다. 
//	Singleton singleton = Singleton.getInstance(); 
	
	Singleton singleton1 = Singleton.getInstance();
	Singleton singleton2 = Singleton.getInstance();
	
	System.out.println(singleton1 == singleton2); //true출력
		
	}

}
