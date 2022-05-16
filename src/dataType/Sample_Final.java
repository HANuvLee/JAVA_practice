package dataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * �ڹ��� final�� �ڷ����� ���� �� �ѹ��� �����Ҽ� �ְ� �����ϴ� Ű�����̴�. 
 * ��, ���� �ѹ� �����ϸ� �� ���� �ٽ� ������ �� ����.
 */

public class Sample_Final {

	public static void main(String[] args) {
		final int n = 123;  // final �� �����ϸ� ���� �ٲܼ� ����.
        //n = 456;  ������ ���� �߻�!
		final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b")); 
		//a = new ArrayList<>(Arrays.asList("c", "d")); ����Ʈ�� ��쵵 final �� ���Ҵ� �Ұ�, ������ �����߻�
		
		/*
		 * ����Ʈ�� ��� final�� ����� ����Ʈ�� ���� ���ϰų�(add) ����(remove) ���� �����ϴ�. 
		 * �ٸ� ���Ҵ縸 �Ұ����� ���̴�. 
		 * ���� �� ���� ���ϰų� ���� �͵� �Ұ����ϰ� �ϰ� ���� ��� 
		 * List.of�� ������ �Ұ����� ����Ʈ(Unmodifiable List)�� �����ؾ� �Ѵ�.
		 */
		final List<String> c = List.of("a", "b");
		a.add("c");  // UnsupportedOperationException �߻�
		

	}

}
