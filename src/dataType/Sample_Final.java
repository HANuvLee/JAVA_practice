package dataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * 자바의 final은 자료형에 값을 단 한번만 설정할수 있게 강제하는 키워드이다. 
 * 즉, 값을 한번 설정하면 그 값을 다시 설정할 수 없다.
 */

public class Sample_Final {

	public static void main(String[] args) {
		final int n = 123;  // final 로 설정하면 값을 바꿀수 없다.
        //n = 456;  컴파일 에러 발생!
		final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b")); 
		//a = new ArrayList<>(Arrays.asList("c", "d")); 리스트의 경우도 final 시 재할당 불가, 컴파일 에러발생
		
		/*
		 * 리스트의 경우 final로 선언시 리스트에 값을 더하거나(add) 빼는(remove) 것은 가능하다. 
		 * 다만 재할당만 불가능할 뿐이다. 
		 * 만약 그 값을 더하거나 빼는 것도 불가능하게 하고 싶은 경우 
		 * List.of로 수정이 불가능한 리스트(Unmodifiable List)를 생성해야 한다.
		 */
		final List<String> c = List.of("a", "b");
		a.add("c");  // UnsupportedOperationException 발생
		

	}

}
