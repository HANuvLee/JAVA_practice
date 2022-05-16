package objectOriented;

/*
 * �޼ҵ��� ��� ������ ���� �� �ݺ��Ǵ� �ڵ带 ��� ȣ���ϴ� �޼ҵ�� �ۼ��ϴ°��� �����ϱ� ����
 */
public class Method {
	
	/* �޼ҵ�� ����� ������ ���� ������ ���� 4������ �з��� �� �ִ�.
	 * �Է°� ����� ��� �ִ� �޼ҵ�
	 * �Է°� ����� ��� ���� �޼ҵ�
	 * �Է��� ���� ����� �ִ� �޼ҵ�
	 * �Է��� �ְ� ����� ���� �޼ҵ�
	 */
	//�Է°� ����� ��� �ִ� �޼ҵ�
	
	int damage(int hit, int count) { //hit, count�� �Ű�����
		return hit * count;
	}
	
	//�Է°��� ���� �޼ҵ�
	String critical() {
		return "Critical!!";
	}
	
	//���ϰ��� ���� �޼ҵ�
	void damgeAlert(int hit, int count) {
		System.out.println("�� ���� ������ ����" + (hit * count) + "�Դϴ�.");
	}
	
	void miss() {
		System.out.println("Miss!");
	}
	
	void useSkill(String skill) {
		if("fire".equals(skill)) {
			return;
		}else {
			System.out.println(skill + "��(��) ����� �� �����ϴ�.");
		}
	}

	public static void main(String[] args) {
		int hit = 3;
		int count = 4;
		
		Method method = new Method();
		
		int Damage = method.damage(hit, count); //hti, count�� �μ�
		String Critical = method.critical();	//�Է°��� ���� �޼ҵ� ȣ��
		
		System.out.println(Damage);
		System.out.println("�Է°��� ���� �޼ҵ� => " + Critical);
		
		method.damgeAlert(4, 6); //���ϰ��� ���� �޼ҵ�
		method.miss(); //�Է°���  ���ϰ��� ���¸޼ҵ�
		
		/*
		 * return�� �Ǵٸ� ���ӻ�
		 * �޼ҵ� ���� �� Ư�� ���ǿ� ���� �޼ҵ带 ��� ���������� ���� ��� return ���� �̿��ϸ� �ȴ�
		 * return ������ �Ἥ �޼ҵ带 ���������� �� ����� �����ڷ����� void�� �޼ҵ忡�� �ش�ȴ�. 
		 * �����ڷ����� ��õǾ� �ִ� �޼ҵ忡�� return ���� �ۼ��ϸ� ������ ������ �߻��Ѵ�.
		 */
		method.useSkill("wind");
		method.useSkill("fire"); //��µ��� �ʴ´�
	}

}
