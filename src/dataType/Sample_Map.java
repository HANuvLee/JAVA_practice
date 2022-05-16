package dataType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 *  Map�� ������ ����ϸ�, Key�� Value�� �� ������ ���� �ڷ���
 *  Map�� ����Ʈ�� �迭ó�� ����������(sequential) �ش� ��� ���� ������ �ʰ�
 *  key�� ���� value�� ��´�
 *  baseball�̶� �ܾ��� ���� ã�� ���ؼ� ������ ������ ���������� ��� �˻��ϴ� ���� �ƴ϶� baseball�̶�� �ܾ �ִ� ������ ���ĺ��� ���̴�
 */
public class Sample_Map {
	
	public static void main(String[] args) {
		/*
		 * Map ���� List�� ���������� �������̽��̴�. 
		 * Map �������̽��� ������ Map�ڷ������� HashMap, LinkedHashMap, TreeMap���� �ִ�.
		 */
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "���");
		map.put("car", "�ڵ���");
		
		System.out.println(map.get("people")); //��� ��� (key�� �ش�Ǵ� value���� ��´�.)
		System.out.println(map.get("Java")); //���� key�� �ش��ϴ� value�� ���� ��쿡 get �޼ҵ带 ����ϸ� ����ó�� null�� ����
		System.out.println("containsKey �޼ҵ� => " + map.containsKey("people"));  // true ���,  ��(Map)�� �ش� Ű(key)�� �ִ����� �����Ͽ� �� ������� ����
		System.out.println("remove �޼ҵ� => " +map.remove("people")); //��� ���, remove �޼ҵ�� ���� �׸��� �����ϸ� key���� �ش�Ǵ� ������(key, value)�� ������ �� �� value ���� ����
		System.out.println("size �޼ҵ� => " +map.size()); // 1��� 
		System.out.println("keySet �޼ҵ� => " +map.keySet()); // [car] ���, keySet() �޼ҵ�� Map�� ��� Key�� ��Ƽ� Set �ڷ������� ����
		List<String> keyList = new ArrayList<>(map.keySet()); //Set �ڷ����� ������ ���� List �ڷ������� �ٲپ� ��� �����ϴ�
		
	/*
	 *LinkedHashMap�� TreeMap
	 *Map�� ���� ū Ư¡�� ������ �������� �ʰ� key�� value�� �������µ� �ִ�. 
	 *������ ������ Map�� �Էµ� ������� �����͸� �������� ���� ��쵵 �ְ� ���δ� �Էµ� key�� ���� ��Ʈ�� �����͸� �������� ���� ���� ���� ���̴�. 
	 *�̷���쿡�� LinkedHashMap�� TreeMap�� ����ϴ� ���� �����ϴ�
	 *LinkedHashMap�� �Էµ� ������� �����͸� �����ϴ� Ư¡�� ������ �ִ�.
	 *TreeMap�� �Էµ� key�� �������� ������ �����͸� �����ϴ� Ư¡�� ������ �ִ�.
	 */
		
	}

}
