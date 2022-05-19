package java_else;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.IntStream;

/*
 * 스트림은 글자 그대로 해석하면 "흐름" 이라는 뜻이다. 데이터가 물결처럼 흘러가면서 필터링 과정을 통해 여러번 변경되어 반환되기 때문에 이러한 이름을 갖게 되었다.
 * 정수배열을 예로들어 짝수만 찾아 중복을 제거한 후 역순으로 정렬하는 프로그램을 만든다.
 */

public class Sample_Stream {

	public static void main(String[] args) {
		
	int[] data = {2,3,5,1,3,13,12,31,4,2,5,8,90,8,7,5,9,0,7,8,7,5,4,8,};
	
	//짝수만 포함나는 arrayList 생성
	ArrayList<Integer> dataList = new ArrayList<>();
	for(int i=0; i<data.length; i++) {
		if(data[i] % 2 == 0) {
			dataList.add(data[i]);
		}
	}
	//Set을 이용하여 중복허용x
	HashSet<Integer> dataSet = new HashSet<>(dataList);
	//Set을 다시 List로 변경
	ArrayList<Integer> distinctList = new ArrayList<>(dataSet);
	//역순으로 정렬
	distinctList.sort(Comparator.reverseOrder());
	//Integer 리스트를 정수배열로 변환
	int[] result = new int[distinctList.size()];
	for(int i=0; i < distinctList.size(); i++) {
		result[i] = distinctList.get(i);
	}
	
	/*
	 * 위의 코드를 스트림을 사용하여 바꿔본다.
	 */
	int[] data2 = {2,3,5,6,7,8,9,7,6,4,2,5,7,9,0,8,7,6,2};
	int[] result2 = Arrays.stream(data2)  // 정수 배열을 IntStream을 생성한다.
         .boxed()  // IntStream을 Stream<Integer>로 변경한다. 이유는 뒤에 사용할 정렬메서드는 원시타입인 int대신 Integerf를 사용해야하기 때문
         .filter((a) -> a % 2 == 0)  //  짝수만 걸러낸다. (a) -> a % 2 == 0(람다함수 사용), 입력 a가 짝수인지를 조사하는 람다함수로 짝수에 해당되는 데이터만 필터링
         .distinct()  // 중복을 제거한다.
         .sorted(Comparator.reverseOrder())  // 역순으로 정렬한다.
         .mapToInt(Integer::intValue)  // Integer의 Stream(Stream<Integer>)을 IntStream으로 변경한다. 최종적으로 int[]타입의 배열을 리턴해야하기 때문이다.
         .toArray()  // int[] 배열로 반환한다.
         ;
	}
}
