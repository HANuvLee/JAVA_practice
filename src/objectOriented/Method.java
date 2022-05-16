package objectOriented;

/*
 * 메소드의 사용 이유는 여러 번 반복되는 코드를 묶어서 호출하는 메소드로 작성하는것이 현명하기 때문
 */
public class Method {
	
	/* 메소드는 입출력 유무에 따라 다음과 같이 4가지로 분류할 수 있다.
	 * 입력과 출력이 모두 있는 메소드
	 * 입력과 출력이 모두 없는 메소드
	 * 입력은 없고 출력은 있는 메소드
	 * 입력은 있고 출력은 없는 메소드
	 */
	//입력과 출력이 모두 있는 메소드
	
	int damage(int hit, int count) { //hit, count는 매개변수
		return hit * count;
	}
	
	//입력값이 없는 메소드
	String critical() {
		return "Critical!!";
	}
	
	//리턴값이 없는 메소드
	void damgeAlert(int hit, int count) {
		System.out.println("총 누적 데미지 수는" + (hit * count) + "입니다.");
	}
	
	void miss() {
		System.out.println("Miss!");
	}
	
	void useSkill(String skill) {
		if("fire".equals(skill)) {
			return;
		}else {
			System.out.println(skill + "를(을) 사용할 수 없습니다.");
		}
	}

	public static void main(String[] args) {
		int hit = 3;
		int count = 4;
		
		Method method = new Method();
		
		int Damage = method.damage(hit, count); //hti, count는 인수
		String Critical = method.critical();	//입력값이 없는 메소드 호출
		
		System.out.println(Damage);
		System.out.println("입력값이 없는 메소드 => " + Critical);
		
		method.damgeAlert(4, 6); //리턴값이 없는 메소드
		method.miss(); //입력값도  리턴값도 없는메소드
		
		/*
		 * return의 또다른 쓰임새
		 * 메소드 수행 시 특정 조건에 따라 메소드를 즉시 빠져나가고 싶은 경우 return 문을 이용하면 된다
		 * return 문만을 써서 메소드를 빠져나가는 이 방법은 리턴자료형이 void인 메소드에만 해당된다. 
		 * 리턴자료형이 명시되어 있는 메소드에서 return 문만 작성하면 컴파일 오류가 발생한다.
		 */
		method.useSkill("wind");
		method.useSkill("fire"); //출력되지 않는다
	}

}
