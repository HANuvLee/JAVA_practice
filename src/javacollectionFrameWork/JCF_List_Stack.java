package javacollectionFrameWork;

import java.util.Stack;

/*
 * 맨 마지막 위치(top)에서만 자료를 추가,삭제, 꺼내올 수 있다 ( 중간의 자료를 꺼낼 수 없다)
 * 먼저 들어간 자료가 나중에 나오는 Last In First Out ( 후입선출 ) 구조 , 택배 상자가 쌓여있는 모양
 * 가장 최근의 자료를 찾아오거나 게임에서 히스토리를 유지하고 이를 무를때 사용할 수 있다
 * 함수의 메모리는 호출 순서에 따른 stack 구조
 * 그래프의 깊이 우선 탐색(DFS)에서 사용
 * 재귀적(Recursion) 함수를 호출 할 때 사용
 */
public class JCF_List_Stack {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>(); //int형 스택 선언
		//Stack<String> stackS = new Stack<>(); char형 스택 선언
		
		stack.push(1);     // stack에 값 1 추가
		stack.push(2);     // stack에 값 2 추가
		stack.push(3);     // stack에 값 3 추가
		System.out.println("Stack : " + stack);
		
		stack.pop();       // stack에 값 제거 , 가장 위의 원소 값이 제거 (값: 3)
		System.out.println("Stack pop Method: " + stack);
		
		System.out.println("Stack peek Method: " + stack.peek());     // stack의 가장 상단의 값 출력
		
		stack.clear();     // stack의 전체 값 제거 (초기화)
		System.out.println("Stack clear Method: " + stack);
		
		stack.push(1);     
		stack.push(2);     
		stack.push(3);    
		
		System.out.println("Stack size Method: " + stack.size());
		   
		System.out.println("Stack empty Method: " + stack.empty());// stack이 비어있는제 check (비어있다면 true)
		
		System.out.println("Stack contains Method: " + stack.contains(1)); // stack에 1이 있는지 check (있다면 true)

	}

}
