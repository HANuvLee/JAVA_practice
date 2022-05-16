package dataType;
/*
 * Enum은 서로 관련이 있는 여러 개의 상수 집합을 정의할 때 사용한다.
 * Enum을 사용하는 이유
 * 매직넘버(1과 같은 숫자 상수값)를 사용할 때보다 코드가 명확해 진다.
 * 잘못된 값을 사용함으로 인해 발생할수 있는 위험성이 사라진다
 */
public class Sample_Enum {
	enum Avengers{
		IronMan,
		Thor,
		Hulk
	}

	public static void main(String[] args) {
		System.out.println(Avengers.IronMan);
		System.out.println(Avengers.Hulk);
		System.out.println(Avengers.Thor);
		
		for(Avengers member : Avengers.values()) {
			System.out.println("Avengers Member => " + member);
		}
	}

}
