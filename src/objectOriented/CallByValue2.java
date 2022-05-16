package objectOriented;
/*
 * ====================참조타입에서의 작동방식====================
 * 참조형은 힙 영역에 저장.
 * 객체의 주소값을 매개변수로 전달하니 Call by reference가 아니냐는 의문이 있지만
 * 정확히 말하면 주소값이 아닌 주소를 가리키는 참조값인거다.!
 * '참조 타입'은 Heap Memory 영역에 생성된 객체의 주소값을 참조하기 때문에 '참조 타입' 이라고 불린다.
 * 따라서 주소를 가리키는 참조값 자체를 복사없이 인자로 전달하는 것이 아닌 자기 자신이 갖고 있는 주소를 가리키는 참조값을 복사해서 전달한다. 
 * Method1에서 Method2로 넘겨준건 Person의 주소를 가리키는 참조값이고, Method1이 가지고 있는 주소를 가리키는 참조값과 동일한 주소를 가리키는 참조값을 인자값으로 받은 상태.
 * 결국, 기본형타입변수 또는 참조형타입변수 모두 자기 자신이 갖고 있는 값을 복사해서 전달하기에 Call by Value인 것 이다. 
 */
class Human{
	int age;
	String name;
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

public class CallByValue2 {
	
	public void method_1() {
		Human human = new Human(25, "Nick");
		System.out.println("Before Call Method2 : ( age = " + human.age + ", name = " + human.name + " )");
		method_2(human);
		System.out.println("After Call Method2 : ( a = " + human.age + ", b = " + human.name + " )");
	}
	
	//new키워드 사용시 객체값은 변화 X 
	public void method_2(Human human) {
//		human = new Human(22, "Ann"); //new 키워드를 사용하여 새로운 객체를 생성하고 이 주소를 참조, 두 변수는 서로 다른 주소를 가리키는 참조값을 가지고 있기에 바뀌지 않는다!
		human.age = 22;
		human.name = "Ann";
		System.out.println("Inside Method2 : ( age = " + human.age + ", name = " + human.name + " )");

	}


	public static void main(String[] args) {
		CallByValue2 method1 = new CallByValue2();
		method1.method_1();

	}

}
