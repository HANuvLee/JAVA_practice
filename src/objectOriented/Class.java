package objectOriented;

/*
 * class�� �⺻������ ��ü�� ����� ����� ������ �ִ�.
 * class�� ��ü�� ����� ���� Ʋ
 */
class Avengers{
	//��ü����=�ν��Ͻ�����=�������=�Ӽ�
	String name; 
	//�޼ҵ�
	//setName �޼ҵ� ���ο� ���� this�� Avengers Ŭ������ ���ؼ� ������ ��ü�� ��Ī
	//��, this.name = name; => ironMan.name = "Ironman"
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
		 * ��ü������ �������� �ʴ´�!
		 */
		System.out.println(ironMan.name); //��ü : ironMan, ��ü���� : name
		System.out.println(thor.name);
	}

}
