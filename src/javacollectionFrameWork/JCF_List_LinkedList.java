package javacollectionFrameWork;

import java.util.LinkedList;
import java.util.List;

/*
 * List컬렉션은 객체를 일렬로 늘어놓은 구조, 인덱스로 관리하기 때문에 객체 추가시 자동 인덱스가 부여된다.
 * 인덱스는 객체를 검색, 삭제 시 사용한다.
 * List컬렉션은 객체를 저장하는 것이 아닌 객체의번지를 참조한다.
 * 동일한 객체를 저장할 수 있으며 이 경우에는 동일한 객체의 번지를 참조, null도 저장가능, 중복적인 값도 저장 가능
 */
public class JCF_List_LinkedList {

	public static void main(String[] args) {
		/*
		 * ArrayList에는 내부 배열에 객체를 저장해 인덱스로 관리, LinkedList는 인접하는 참조를 링크해서 체인처럼 관리한다. 
		 * 따라서 LinkedList에서 특정 인덱스의 객체를 제거할 시, 제거되는 인덱스의 앞 뒤 링크만 변경되고 나머지 링크는 변경되지 않는다.
		 * 객체 삽입 및 삭제에 좋은 성능을 발휘.
		 */
		
		List<Integer> list = new LinkedList<>(); // LinkedList 생성

		list.add(1); // 값 추가
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.print("추가된 값: ");
		for (int l : list) { // iterator를 이용해 리스트에 값 출력
			System.out.print(l+"\t");
		}
		System.out.println();

		list.set(2, 5); // 리스트 수정

		System.out.print("수정된 값: ");
		for (int l : list) { // iterator를 이용해 리스트에 값 출력
			System.out.print(l+"\t");
		}
		System.out.println();

		list.remove(1); // 리스트 삭제

		System.out.print("삭제된 값: ");
		for (int i = 0; i < list.size(); i++) { // 일반 for를 이용해서 반복
			System.out.print(list.get(i)+"\t"); // .get() 메서드를 이용해 리스트에 값 출력
		}
		System.out.println();
		
		}
		

	}

