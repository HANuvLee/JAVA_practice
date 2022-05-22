package javacollectionFrameWork;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 맨 앞(front) 에서 자료를 꺼내거나 삭제하고, 맨 뒤(rear)에서 자료를 추가
 * 먼저 들어온 데이터가 가장 먼저 나가는 구조인 Fist In First Out (선입선출) 구조 , 일상 생활에서 일렬로 줄 서 있는 모양
 * 먼저 들어간 자료가 먼저 나오는 구조 FIFO(First In FIrst Out) 구조 
 * 큐는 한 쪽 끝은 프런트(front)로 정하여 삭제 연산만 수행하며, 다른 한 쪽 끝은 리어(rear)로 정하여 삽입 연산만 수행
 * 그래프의 넓이 우선 탐색(BFS)에서 사용
 * 컴퓨터 버퍼에서 주로 사용, 많은 양의 입력값을 처리 하지 못할 때, 버퍼(큐)를 만들어 대기 시킴
 */

public class JCF_Queue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>(); //int형 queue 선언, linkedlist 이용
		//Queue<String> queue = new LinkedList<>(); String형 queue 선언, linkedlist 이용
		
		queue.add(1);     // queue에 값 1 추가 삽입에 성공하면 true를 반환
		queue.add(2);     // queue에 값 2 추가 삽입에 성공하면 true를 반환
		queue.offer(3);   // queue에 값 3 추가 삽입에 성공하면 true를 반환
		System.out.println("Queue: " + queue);

		System.out.println("Queue peek Method: " + queue.peek());// queue의 첫번째 값 참조

		System.out.println("Queue poll Method: " + queue.poll()); // queue에 첫번째 값을 반환하고 제거 비어있다면 null
		System.out.println("Queue after poll: " + queue);
		
		System.out.println("Queue remove Method: " + queue.remove());// queue에 첫번째 값 제거
		
		queue.clear();      // queue 초기화
		
		System.out.println("Queue after clear: " + queue);
		System.out.println("Queue after clear poll Method: " + queue.poll());
	}

}
