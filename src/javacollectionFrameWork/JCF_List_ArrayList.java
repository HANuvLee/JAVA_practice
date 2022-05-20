package javacollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
 * List컬렉션은 객체를 일렬로 늘어놓은 구조, 인덱스로 관리하기 때문에 객체 추가시 자동 인덱스가 부여된다.
 * 인덱스는 객체를 검색, 삭제 시 사용한다.
 * List컬렉션은 객체를 저장하는 것이 아닌 객체의번지를 참조한다.
 * 동일한 객체를 저장할 수 있으며 이 경우에는 동일한 객체의 번지를 참조, null도 저장가능, 중복적인 값도 저장 가능
 * 객체 검색, 맨 마지막 인덱스에 객체 추가에 좋은 성능을 발휘함
 */
public class JCF_List_ArrayList {

	public static void main(String[] args) {
		/*
		 * 컬렉션 계열에서 데이터 타입을 지정하기 위해서 제네릭 사용, <데이터 타입> 을 쓴다.
		 * 데이터 타입은 일반 변수 타입이 아닌 Wrapper class 타입으로 지정
		 * ArrayList와 배열의 차이는 둘 다 인덱스로 객체를 관리하지만 ArrayList는 크기가 동적으로 늘어난다. 
		 * 배열은 크기를 먼저 지정하고 사용해야 하며 크기가 정해져 있다.
		 */
		List<Integer> list = new ArrayList<>();
		
		//데이터 타입 - random 클래스
		Random ran = new Random();
		for(int i = 0; i < 5;  i++) {
			list.add(ran.nextInt(30) + 1);
		}
		//출력
		for(int i = 0; i < 5; i++) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		
		//중간삽입 - index 3 (4번째) 중간 삽입
		list.add(3, 35);
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		
		//치환 - 첫번째 값을 치환
		list.set(0, 40);
		
		System.out.println("삭제 전 list크기: " + list.size());
		
		//삭제 - 마지막 인덱스
		list.remove(4);
		
		System.out.println("삭제 후 list크기: " + list.size());
		
		for (int i = 0; i < 5; i++) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		System.out.print("iterator 사용: "+"\t");
		for (int i : list) {
			System.out.print(i+"\t");
		}
	}

}
