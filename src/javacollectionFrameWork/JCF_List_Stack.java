package javacollectionFrameWork;

import java.util.Stack;

/*
 * �� ������ ��ġ(top)������ �ڷḦ �߰�,����, ������ �� �ִ� ( �߰��� �ڷḦ ���� �� ����)
 * ���� �� �ڷᰡ ���߿� ������ Last In First Out ( ���Լ��� ) ���� , �ù� ���ڰ� �׿��ִ� ���
 * ���� �ֱ��� �ڷḦ ã�ƿ��ų� ���ӿ��� �����丮�� �����ϰ� �̸� ������ ����� �� �ִ�
 * �Լ��� �޸𸮴� ȣ�� ������ ���� stack ����
 * �׷����� ���� �켱 Ž��(DFS)���� ���
 * �����(Recursion) �Լ��� ȣ�� �� �� ���
 */
public class JCF_List_Stack {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>(); //int�� ���� ����
		//Stack<String> stackS = new Stack<>(); char�� ���� ����
		
		stack.push(1);     // stack�� �� 1 �߰�
		stack.push(2);     // stack�� �� 2 �߰�
		stack.push(3);     // stack�� �� 3 �߰�
		System.out.println("Stack : " + stack);
		
		stack.pop();       // stack�� �� ���� , ���� ���� ���� ���� ���� (��: 3)
		System.out.println("Stack pop Method: " + stack);
		
		System.out.println("Stack peek Method: " + stack.peek());     // stack�� ���� ����� �� ���
		
		stack.clear();     // stack�� ��ü �� ���� (�ʱ�ȭ)
		System.out.println("Stack clear Method: " + stack);
		
		stack.push(1);     
		stack.push(2);     
		stack.push(3);    
		
		System.out.println("Stack size Method: " + stack.size());
		   
		System.out.println("Stack empty Method: " + stack.empty());// stack�� ����ִ��� check (����ִٸ� true)
		
		System.out.println("Stack contains Method: " + stack.contains(1)); // stack�� 1�� �ִ��� check (�ִٸ� true)

	}

}
