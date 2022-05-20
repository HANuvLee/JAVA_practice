package javacollectionFrameWork;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * Set 컬렉션은 저장 순서가 유지되지 않는다. 객체를 중복해서 저장할 수 없고, 하나의 null만 저장가능하다.
 * 그렇기에 Set컬렉션은 순서 자체가 없으므로 인덱스로 객체를 검색해서 가져오는 get(index) 메소드도 없다.
 * 대신 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자(Iterator)를 제공한다.
 * iterator() 메소드를 호출하면 얻을 수 있다.
 * 들어갈(저장할) 때의 순서와 나올(찾을) 때의 순서가 다를수도 있다 
 * Set의 가장 큰 장점은 중복을 자동으로 제거해준다
 */
public class JCF_Set_TreeSet {
	
	/*
	 * TreeSet은 이진 트리를 기반으로 한 Set컬렉션이다.
	 * 하나의 노드의 노드값인 value와 왼쪽과 오른쪽 노드를 참조하기 위한 두 개의 변수로 구성된다.
	 * TreeSet에 객체를 정하면 자동으로 정렬되는데 부모값과 비교해서 낮은 것은 왼쪽 자식 노드에, 높은 것은 오른쪽 자식 노드에 저장된다.
	 * TreeSet은 이진 탐색 트리(BinarySearchTree) 구조로 이루어져 있어 HashSet보다 추가와 삭제에 시간이 더 걸리지만 정렬, 검색에 높은 성능을 보이는 자료구조이다.
	 * 데이터 저장 시 이진탐색트리(BinarySearchTree)의 형태로 데이터를 저장하기에 기본적으로 nature ordering를 지원하며 
	 * 생성자의 매개변수로 Comparator객체를 입력하여 정렬 방법을 임의로 지정해 줄 수도 있다
	 * HashSet의 경우 정렬을 해주지 않고 TreeSet의 경우 자동정렬을 해준다
	 */

	public static void main(String[] args) {
		//TreeSet - 선언 (TreeSet은 선언 시 크기지정이 불가)
		TreeSet<Integer> set1 = new TreeSet<Integer>();//TreeSet생성
		TreeSet<Integer> set2 = new TreeSet<>();//new에서 타입 파라미터 생략가능
		TreeSet<Integer> set3 = new TreeSet<Integer>(set1);//set1의 모든 값을 가진 TreeSet생성
		TreeSet<Integer> set4 = new TreeSet<Integer>(Arrays.asList(1,2,3));//초기값 지정
		
		//TreeSet - 값 추가 
		TreeSet<Integer> set = new TreeSet<Integer>();//TreeSet생성
		set.add(7); //값추가
		set.add(4);
		set.add(9);
		set.add(2);
		set.add(5);
		
		//TreeSet - 크기 구하기
		System.out.println(set.size());//크기 : 3
		
		//TreeSet - 값 출력
		System.out.println("전체출력: " + set); //전체출력 [2,3,4]
		System.out.println("최소값출력: " + set.first());//최소값 출력
		System.out.println("최대값출력: " + set.last());//최대값 출력
		System.out.println("입력값보다 큰 데이터중 최소값 출력: " + set.higher(10));//입력값보다 큰 데이터중 최소값 출력 없으면 null
		System.out.println("입력값보다 작은 데이터중 최대값 출력: " + set.lower(1));//입력값보다 작은 데이터중 최대값 출력 없으면 null
				
		Iterator<Integer> iter = set.iterator();	// Iterator 사용
		while(iter.hasNext()) {//값이 있으면 true 없으면 false
		    System.out.println(iter.next());
		}
		
		//TreeSet - 값 삭제
		set.remove(1);//값 1 제거
		set.clear();//모든 값 제거
		
		if(set.isEmpty()) {
            System.out.println("비었습니다.");
        }

	}

}
