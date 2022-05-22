package javacollectionFrameWork;

import java.util.LinkedList;
import java.util.Queue;

/*
 * �� ��(front) ���� �ڷḦ �����ų� �����ϰ�, �� ��(rear)���� �ڷḦ �߰�
 * ���� ���� �����Ͱ� ���� ���� ������ ������ Fist In First Out (���Լ���) ���� , �ϻ� ��Ȱ���� �Ϸķ� �� �� �ִ� ���
 * ���� �� �ڷᰡ ���� ������ ���� FIFO(First In FIrst Out) ���� 
 * ť�� �� �� ���� ����Ʈ(front)�� ���Ͽ� ���� ���길 �����ϸ�, �ٸ� �� �� ���� ����(rear)�� ���Ͽ� ���� ���길 ����
 * �׷����� ���� �켱 Ž��(BFS)���� ���
 * ��ǻ�� ���ۿ��� �ַ� ���, ���� ���� �Է°��� ó�� ���� ���� ��, ����(ť)�� ����� ��� ��Ŵ
 */

public class JCF_Queue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>(); //int�� queue ����, linkedlist �̿�
		//Queue<String> queue = new LinkedList<>(); String�� queue ����, linkedlist �̿�
		
		queue.add(1);     // queue�� �� 1 �߰� ���Կ� �����ϸ� true�� ��ȯ
		queue.add(2);     // queue�� �� 2 �߰� ���Կ� �����ϸ� true�� ��ȯ
		queue.offer(3);   // queue�� �� 3 �߰� ���Կ� �����ϸ� true�� ��ȯ
		System.out.println("Queue: " + queue);

		System.out.println("Queue peek Method: " + queue.peek());// queue�� ù��° �� ����

		System.out.println("Queue poll Method: " + queue.poll()); // queue�� ù��° ���� ��ȯ�ϰ� ���� ����ִٸ� null
		System.out.println("Queue after poll: " + queue);
		
		System.out.println("Queue remove Method: " + queue.remove());// queue�� ù��° �� ����
		
		queue.clear();      // queue �ʱ�ȭ
		
		System.out.println("Queue after clear: " + queue);
		System.out.println("Queue after clear poll Method: " + queue.poll());
	}

}
