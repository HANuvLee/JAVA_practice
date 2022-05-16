package objectOriented;


/*
 * 다형성 => 클래스의 핵심은 유지하고, 구현방식의 모양과 모습을 달라지게 하는것 
 * 다형성을 이해하기 위해서는 상속에서의 부모 클래스 속성이 자식클래스에게 상속된다느것을 기억!
 * 메소드 오버라이딩 사용 시 부모클래스의 메소드리턴타입과 자식클래스의 메소드리턴타입은 동일해야한다(클래스의 핵심이 유지되는 이유).
 */
class Car{
	public String engineStart() {
		return "EngineStart!!";
	}
	public String engineStop() {
		return "EngineStop.";
	}
}

class Kia extends Car{
	public String engineStart() { //메소드 오버라이딩 , 같은 메소드명이지만 다른 구현방식이다!!
		return "엔진이 가동됩니다.";
	}
}

class Toyota extends Car{
	public String engineStart() {
		return "스타또!";
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Kia k5 = new Kia();
		Toyota prius = new Toyota();
		
		System.out.println(k5.engineStart());
		System.out.println(prius.engineStart());

	}

}
