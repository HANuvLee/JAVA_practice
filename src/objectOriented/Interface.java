package objectOriented;
/*
 * 자바에서는 클래스를 이용한 다중상속을 지원하지 않는다. 
 * 하지만 인터페이스를 통해 다중상속이 가능
 * 인터페이스는 다른 클래스 작성시 기본이 되는 틀을 제공, 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상클래스
 * 추상 클래스는 추상 메소드뿐만 아니라 생성자, 필드, 일반 메소드도 포함한다.
 * 인터페이스(interface)는 추상 메소드와 상수, JAVA8에서는 정적메소드와 디폴트메소드가 포함한다.
 */
interface Predator{
	String getFood(); //인터페이스 규칙에 따라 메소드의 이름과 입출력정의만 존재 body부분은 X
	
	//JAVA8 이상부터는 메소드 body부분을 구현 하지 못하던 인터페이스에서 실제 구현된 형태의 메소드를 가질 수 있다. 
	default void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
	
	int LEG_COUNT = 4; //인터페이스 상수 , public static final을 생략
	
	static int speed() { // 인터페이스에 스태틱 메서드 구현 시 인터페이스명.스태틱메서드명 과 같이 사용하여 일반 클래스의 스태틱 메서드를 사용하는 것과 동일하게 사용가능.
		return LEG_COUNT * 30;
	}
}

class Animal{
	String name;

	public void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal implements Predator{ //interface 구현을 위해 implements키워드 사용
	@Override
	public String getFood() { //인터페이스 메소드로 인하여 반드시 오버라이딩 , 인터페이스 메소드는 항상 public으로 구현!!
		return "Pig";
	}
}

class Lion extends Animal implements Predator{  //interface 구현을 위해 implements키워드 사용
	@Override
	public String getFood() { //인터페이스 메소드로 인하여 반드시 오버라이딩 , 인터페이스 메소드는 항상 public으로 구현!!
		return "Chicken";
	}
}
// 동물 객체가 늘어날 수록 중복코딩이 늘어난다. (인터페이스를 활요하여 해결가능 Predator Interface 구현)
class ZooKeeper{
	//	feed 메소드의 입력으로 Tiger, Lion을 각각 필요로 했지만 이제 이것을 Predator라는 인터페이스로 대체할 수 있게 되었다.
	//	tiger, lion은 각각 Tiger, Lion의 객체이면서  Predator 인터페이스의 객체이기 때문에 Predator를 자료형의 타입으로 사용가능
	//  인터페이스를 활용하여 Zookeeper클래스가 동물들 종류에 의존적인 클래스에서 상관없는 독립적인 클래스가 되었다!
	void feed(Predator predator) {
        System.out.println("Eat" + predator.getFood());
    }
//  인터페이스 구현으로 인한 코드대체
//	void feed(Tiger tiger) {	//메소드 오버로딩
//		System.out.println("Tiger Eat Pig");
//	}
//	void feed(Lion lion){		//메소드 오버로딩
//		System.out.println("Lion Eat Chicken");
//	}
}
public class Interface {

	public static void main(String[] args) {
		ZooKeeper zookeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();

		zookeeper.feed(lion);
		zookeeper.feed(tiger);

	}

}
