package javacollectionFrameWork;

import java.util.List;
import java.util.Vector;

/*
 * List�÷����� ��ü�� �Ϸķ� �þ���� ����, �ε����� �����ϱ� ������ ��ü �߰��� �ڵ� �ε����� �ο��ȴ�.
 * �ε����� ��ü�� �˻�, ���� �� ����Ѵ�.
 * List�÷����� ��ü�� �����ϴ� ���� �ƴ� ��ü�ǹ����� �����Ѵ�.
 * ������ ��ü�� ������ �� ������ �� ��쿡�� ������ ��ü�� ������ ����, null�� ���尡��, �ߺ����� ���� ���� ����
 */

class Blog{
	String subject;
	String content;
	String writer;
	
	public Blog(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}

public class JCF_List_Vector {

	public static void main(String[] args) {
		/*
		 * Vector�� ArrayList�� ������ ���� ������ ������ �ִ�. 
		 * Vector ��ü�� �����ϱ� ���ؼ��� ������ Ÿ���� �����ؾ� �Ѵ�. 
		 * ArrayList�� �������� Vector Ŭ������ ����ȭ��(synchronized) �޼���� �����Ǿ� �ִ�. 
		 * �׷��� ������ ��Ƽ ������ ȯ�濡�� �����ϰ� ��ü�� �߰�, ������ �� �ִ�. ��, �����忡 �����ϴ�(Thread Safe)��� ���մϴ�. 
		 * �ٸ� ����ȭ�Ǿ� �ֱ� ������ ArrayList ���ٴ� ��ü�� �߰�, �����ϴ� ������ ������ �ۿ� ����. 
		 * �������� �߱��ϴµ� �־ �ӵ��� ������ Ʈ���̵� ����(trade off)�̴�.
		 */
		
		 List<Blog> list = new Vector<Blog>();

        list.add(new Blog("�迭", "array", "���߿��� ����"));
        list.add(new Blog("����Ʈ", "list", "���߿��� ����"));
        list.add(new Blog("������", "����", "���߿��� ����"));

        for(Blog blog : list) {
            System.out.println(blog.subject + ", " + blog.content + ", " + blog.writer);
        }
		

	}

}
