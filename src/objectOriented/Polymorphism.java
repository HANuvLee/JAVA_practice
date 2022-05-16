package objectOriented;


/*
 * ������ => Ŭ������ �ٽ��� �����ϰ�, ��������� ���� ����� �޶����� �ϴ°� 
 * �������� �����ϱ� ���ؼ��� ��ӿ����� �θ� Ŭ���� �Ӽ��� �ڽ�Ŭ�������� ��ӵȴٴ����� ���!
 * �޼ҵ� �������̵� ��� �� �θ�Ŭ������ �޼ҵ帮��Ÿ�԰� �ڽ�Ŭ������ �޼ҵ帮��Ÿ���� �����ؾ��Ѵ�(Ŭ������ �ٽ��� �����Ǵ� ����).
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
	public String engineStart() { //�޼ҵ� �������̵� , ���� �޼ҵ�������� �ٸ� ��������̴�!!
		return "������ �����˴ϴ�.";
	}
}

class Toyota extends Car{
	public String engineStart() {
		return "��Ÿ��!";
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
