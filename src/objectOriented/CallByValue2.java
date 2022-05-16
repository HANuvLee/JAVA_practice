package objectOriented;
/*
 * ====================����Ÿ�Կ����� �۵����====================
 * �������� �� ������ ����.
 * ��ü�� �ּҰ��� �Ű������� �����ϴ� Call by reference�� �ƴϳĴ� �ǹ��� ������
 * ��Ȯ�� ���ϸ� �ּҰ��� �ƴ� �ּҸ� ����Ű�� �������ΰŴ�.!
 * '���� Ÿ��'�� Heap Memory ������ ������ ��ü�� �ּҰ��� �����ϱ� ������ '���� Ÿ��' �̶�� �Ҹ���.
 * ���� �ּҸ� ����Ű�� ������ ��ü�� ������� ���ڷ� �����ϴ� ���� �ƴ� �ڱ� �ڽ��� ���� �ִ� �ּҸ� ����Ű�� �������� �����ؼ� �����Ѵ�. 
 * Method1���� Method2�� �Ѱ��ذ� Person�� �ּҸ� ����Ű�� �������̰�, Method1�� ������ �ִ� �ּҸ� ����Ű�� �������� ������ �ּҸ� ����Ű�� �������� ���ڰ����� ���� ����.
 * �ᱹ, �⺻��Ÿ�Ժ��� �Ǵ� ������Ÿ�Ժ��� ��� �ڱ� �ڽ��� ���� �ִ� ���� �����ؼ� �����ϱ⿡ Call by Value�� �� �̴�. 
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
	
	//newŰ���� ���� ��ü���� ��ȭ X 
	public void method_2(Human human) {
//		human = new Human(22, "Ann"); //new Ű���带 ����Ͽ� ���ο� ��ü�� �����ϰ� �� �ּҸ� ����, �� ������ ���� �ٸ� �ּҸ� ����Ű�� �������� ������ �ֱ⿡ �ٲ��� �ʴ´�!
		human.age = 22;
		human.name = "Ann";
		System.out.println("Inside Method2 : ( age = " + human.age + ", name = " + human.name + " )");

	}


	public static void main(String[] args) {
		CallByValue2 method1 = new CallByValue2();
		method1.method_1();

	}

}
