package objectOriented;

/*
 * class는 기본적으로 객체를 만드는 기능을 가지고 있다.
 * class는 객체를 만들기 위한 틀
 */
class Avengers{
	//객체변수=인스턴스변수=멤버변수=속성
	String name; 
	//메소드
	//setName 메소드 내부에 사용된 this는 Avengers 클래스에 의해서 생성된 객체를 지칭
	//즉, this.name = name; => ironMan.name = "Ironman"
	public void setName(String name) {
		this.name = name;
	}
}

public class Class {

	public static void main(String[] args) {
		Avengers ironMan = new Avengers();
		ironMan.setName("Ironman"); // == ironMan.name = "Ironman";
		
		Avengers thor = new Avengers();
		thor.setName("Thor");
		
		/*
		 * 객체변수는 공유되지 않는다!
		 */
		System.out.println(ironMan.name); //객체 : ironMan, 객체변수 : name
		System.out.println(thor.name);
	}

}
