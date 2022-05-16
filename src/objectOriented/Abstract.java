package objectOriented;
/*
 * 추상메소드=> 선언은 되어 있지만 코드가 구현되지 않은 메소드
 * 메소드의 내용이 너무 일반적인 내용이라 부모 클래스에서 구체화하여 정의할 필요가 없을 경우, 
 * 추상메서드로 선언만하고 상속받은 자식 클래스에서 재정의하도록 할 때 사용.
 * 
 * 추상클래스(abstract class)
 * 정의 : 
 * 	-한 개 이상의 추상메서드를 가지는 클래스
 *  -일반적인 클래스는 세부적 구체적 ex) 고양이과, 개과
 *  -반면 추상클래스는 일반클래스에 비해 추상적 ex) 고양이, 사자, 강아지
 * 목적 : 
 * -구현이 되지 않은 불완전한 추상메소드를 포함하므로 객체 생성 불가.
 * -따라서 추상클래스는 먼저 상속을 통해 자식클래스를 생성하고 자식클래스에 추상클래스의 모든 추상메소드를 오버라이딩하고 나서야 비로소 자식클래의 객체 생성이 가능
 * -추상 클래스는 추상 메소드를 포함하고 있다는 점을 제외하면, 일반 클래스와 모든 점이 같다. 즉, 생성자와 필드, 일반 메소드도 포함할 수 있다.
 */

abstract class Cat{ 	  //추상 메소드를 포함하므로 추상클래스를 선언
	abstract void call(); //추상메소드 선언, body부분 구현 x
	void call2() {System.out.println("일반 메소드");}
}

//Cat 추상클래스를 상속한 클래스들
class Sphynx extends Cat{
	void call() {	//추상메소드는 서브클래스에서 무조건 반드시 재정의!!
		System.out.println("스핑크스 고양이");
	}
}

class Bengal extends Cat{
void call() {
		System.out.println("뱅갈 고양이");
	}
}

public class Abstract {

	public static void main(String[] args) {
		Sphynx sphynx = new Sphynx();
		Bengal bengal = new Bengal();
		
		sphynx.call();
		bengal.call();

	}

}
