package java_else;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.IntStream;

/*
 * ��Ʈ���� ���� �״�� �ؼ��ϸ� "�帧" �̶�� ���̴�. �����Ͱ� ����ó�� �귯���鼭 ���͸� ������ ���� ������ ����Ǿ� ��ȯ�Ǳ� ������ �̷��� �̸��� ���� �Ǿ���.
 * �����迭�� ���ε�� ¦���� ã�� �ߺ��� ������ �� �������� �����ϴ� ���α׷��� �����.
 */

public class Sample_Stream {

	public static void main(String[] args) {
		
	int[] data = {2,3,5,1,3,13,12,31,4,2,5,8,90,8,7,5,9,0,7,8,7,5,4,8,};
	
	//¦���� ���Գ��� arrayList ����
	ArrayList<Integer> dataList = new ArrayList<>();
	for(int i=0; i<data.length; i++) {
		if(data[i] % 2 == 0) {
			dataList.add(data[i]);
		}
	}
	//Set�� �̿��Ͽ� �ߺ����x
	HashSet<Integer> dataSet = new HashSet<>(dataList);
	//Set�� �ٽ� List�� ����
	ArrayList<Integer> distinctList = new ArrayList<>(dataSet);
	//�������� ����
	distinctList.sort(Comparator.reverseOrder());
	//Integer ����Ʈ�� �����迭�� ��ȯ
	int[] result = new int[distinctList.size()];
	for(int i=0; i < distinctList.size(); i++) {
		result[i] = distinctList.get(i);
	}
	
	/*
	 * ���� �ڵ带 ��Ʈ���� ����Ͽ� �ٲ㺻��.
	 */
	int[] data2 = {2,3,5,6,7,8,9,7,6,4,2,5,7,9,0,8,7,6,2};
	int[] result2 = Arrays.stream(data2)  // ���� �迭�� IntStream�� �����Ѵ�.
         .boxed()  // IntStream�� Stream<Integer>�� �����Ѵ�. ������ �ڿ� ����� ���ĸ޼���� ����Ÿ���� int��� Integerf�� ����ؾ��ϱ� ����
         .filter((a) -> a % 2 == 0)  //  ¦���� �ɷ�����. (a) -> a % 2 == 0(�����Լ� ���), �Է� a�� ¦�������� �����ϴ� �����Լ��� ¦���� �ش�Ǵ� �����͸� ���͸�
         .distinct()  // �ߺ��� �����Ѵ�.
         .sorted(Comparator.reverseOrder())  // �������� �����Ѵ�.
         .mapToInt(Integer::intValue)  // Integer�� Stream(Stream<Integer>)�� IntStream���� �����Ѵ�. ���������� int[]Ÿ���� �迭�� �����ؾ��ϱ� �����̴�.
         .toArray()  // int[] �迭�� ��ȯ�Ѵ�.
         ;
	}
}
