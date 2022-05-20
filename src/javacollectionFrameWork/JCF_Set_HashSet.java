package javacollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set �÷����� ���� ������ �������� �ʴ´�. ��ü�� �ߺ��ؼ� ������ �� ����, �ϳ��� null�� ���尡���ϴ�.
 * ��� ��ü ��ü�� ������� �� ���� �ݺ��ؼ� �������� �ݺ���(Iterator)�� �����Ͽ� iterator() �޼ҵ带 ȣ���ϸ� ���� �� �ִ�.
 * ���� ����� ���� ������ �����ؾ� �Ѵٸ� LinkedHashSet Ŭ������ ���
 * Set�÷����� ���� ��ü�� �����Ƿ� �ε����� ��ü�� �˻��ؼ� �������� get(index) �޼ҵ嵵 ����.
 * ��(������) ���� ������ ����(ã��) ���� ������ �ٸ����� �ִ� 
 * Set�� ���� ū ������ �ߺ��� �ڵ����� �������ش�
 */
public class JCF_Set_HashSet {
	/*
	 * HashSet�� ��ü���� �������� �����ϰ� ������ ��ü�� �ߺ� �������� �ʴ´�.
	 * HashSet�� ��ü�� �����ϱ� ���� ���� ��ü�� hashCode() �޼ҵ带 ȣ���ؼ� �ؽ��ڵ带 ���� ����Ǿ� �ִ� ��ü���� �ؽ��ڵ�� ���Ѵ�. 
	 * ���� ���� �ؽ��ڵ尡 �ִٸ� �ٽ� equals() �޼ҵ�� �� ��ü�� ���ؼ� true�� ������ ������ ��ü�� �Ǵ��ϰ� �ߺ� �������� �ʴ´�.
	 * ������� ���� ���� �ӵ��� ������
	 * ���� �����̱⿡ ������ ������ �ε����� �������� �ʴ´�. 
	 * �׷��⿡ ���� �߰� �� ���� �� �߰� Ȥ�� �����ϰ��� �ϴ� ���� Set ���ο� �ִ��� �˻� �� �� �߰��� ������ �ϱ� ������ �ӵ��� List������ ���� ����.
	 */

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();

        set.add("JAVA");
        set.add("�ڹ�");
        set.add("JAVA");
        set.add("���߿��� ����");
        set.add("JAVA�� ��ü�������Դϴ�.");

        int size = set.size();
        System.out.println("�� ��ü�� : " + size);

        Iterator<String> iterator = set.iterator();// Iterator ��� 
        while(iterator.hasNext()) { //���� ������ true ������ false
            String str = iterator.next(); //�ϳ��� ��ü�� ������ �� next() �޼ҵ带 ���
            System.out.println(str);
        }

        set.remove("JAVA"); 

        size = set.size();
        System.out.println("���� �� �� ��ü�� : " + size);

        set.clear(); //��� �� ����

        if(set.isEmpty()) {
            System.out.println("������ϴ�.");
        }
	
	}

}
