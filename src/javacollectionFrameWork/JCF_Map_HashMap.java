package javacollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 *  Map �÷����� Ű(Key)�� ��(value)���� ������ Entry ��ü�� �����ϴ� ������ ������ �ִ�.
 *  Ű�� ���� ��� ��ü�̸�, Ű�� �ߺ��� �� ����. 
 *  ����, ������ Ű�� ������ �ִ� Entry ��ü�� Map �÷��ǿ� �����ϸ�, ������ ���� �������� ���ο� ������ ��ġ�ȴ�.
 *  Map �������̽��� �����ϱ� ������ Map �������̽��� ����� �޼��带 ��� ������ �ִ�.
 */
public class JCF_Map_HashMap {

	public static void main(String[] args) {
		/*
		 * HashMap�� Map �������̽��� ������ ��ǥ���� Map �÷����̴�. 
		 * Map �������̽��� ����ϰ� �ֱ⿡ Map�� ������ �״�� ������ �ִ�. 
		 * HashMap�� �̸� �״�� �ؽ�(Hashing)�� ����ϱ� ������ ���� ���� �����͸� �˻��ϴ� �� �־ �پ ������ ���δ�.
		 * HashMap�� Ű�� ����� ��ü�� hashCode()�� equals()�޼��带 �������̵��ؼ� ���� ��ü�� �� ������ �����ؾ� �Ѵ�.
		 * ���� ��ü���� ������ Ű�� �� ������ hashCode() ���� ����, equals() �޼��尡 true�� ��ȯ�ؾ� �Ѵ�.
		 * Listó�� ��������� �� ĭ�� �ø��� �ʰ� �� �ι�� �ø���. ���⼭ �����ϰ� ���� �߻��Ѵ�.
		 */
		HashMap<String,String> map1 = new HashMap<String,String>();//HashMap����
		HashMap<String,String> map2 = new HashMap<>();//new���� Ÿ�� �Ķ���� ��������
		HashMap<String,String> map3 = new HashMap<>(map1);//map1�� ��� ���� ���� HashMap����
		HashMap<String,String> map4 = new HashMap<>(10);//�ʱ� �뷮(capacity)����
		HashMap<String,String> map5 = new HashMap<>(10, 0.7f);//�ʱ� capacity,load factor����
		HashMap<String,String> map6 = new HashMap<String,String>(){{//�ʱⰪ ����
		    put("a","b");
		}};
		
		
		Map<Integer, String> map = new HashMap<>(){{ //�ʱⰪ ����
			put(1,"���"); //�� �߰�
			put(2,"�ٳ���");
			put(3,"����");
		}};
		
		System.out.println(map); //��ü ��� : {1=���, 2=�ٳ���, 3=����}
		System.out.println(map.get(1));//key�� 1�� value��� : ���
		
		//entrySet() Ȱ��
		for (Entry<Integer, String> entry : map.entrySet()) {
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		//[Key]:1 [Value]:���
		//[Key]:2 [Value]:�ٳ���
		//[Key]:3 [Value]:����
		
		//KeySet() Ȱ��
		for(Integer i : map.keySet()){ //����� key�� Ȯ��
		    System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
		}
		//[Key]:1 [Value]:���
		//[Key]:2 [Value]:�ٳ���
		//[Key]:3 [Value]:����
		
		/* ==> HashMap ��� ���. 
		 * �׳� print�ϰ� �Ǹ� {}�� ���� Map�� ��ü key��, value�� ���. 
		 * Ư�� key���� value�� ��������ʹٸ� get(key)�� ���
		 * ��ü�� ����Ϸ��� entrySet()�̳� keySet()�޼ҵ带 Ȱ���Ͽ� Map�� ��ü�� ��ȯ���� �� ���. 
		 * entrySet()�� key�� value ��ΰ� �ʿ��� ��� ��� & keySet()�� key ���� �ʿ��� ��� ����ϴµ� key���� �޾Ƽ� get(key)�� Ȱ��
		 * value�� ����� ���� �ֱ⿡ ��κ� �ڵ尡 ������ keySet�� Ȱ�������� key���� �̿��Ͽ� value�� ã�� �������� �ð��� ���� �Ҹ�ǹǷ�
		 * ���� ���� �����͸� �����;� �Ѵٸ� entrySet()�� ����.(�� 20%~200% ���� ����)
		 */
		
		
		/* iterator ���*/
		
		//entrySet().iterator()
		Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
		while(entries.hasNext()){
		    Map.Entry<Integer, String> entry = entries.next();
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" +  entry.getValue());
		}
		//[Key]:1 [Value]:���
		//[Key]:2 [Value]:�ٳ���
		//[Key]:3 [Value]:����
				
		//keySet().iterator()
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()){
		    int key = keys.next();
		    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
		}
		//[Key]:1 [Value]:���
		//[Key]:2 [Value]:�ٳ���
		//[Key]:3 [Value]:����
		

	}
}