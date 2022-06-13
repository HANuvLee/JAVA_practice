package java_else;

/*
 * String ��ü�� �ѹ� �Ҵ�� ������ ������ ������	StringBuffer �Ǵ� StringBuilder�� ��ü������ ������ �� ũ�⸦ �ø���.
 * StringBuffer�� ��Ƽ������ ���¿��� ����ȭ�� �����ϰ� StringBuilder�� ���� ������ ȯ�濡�� ����Ѵ�.
 * �ӵ� : StringBuilder > StringBuffer / ���� : StringBuffer > StringBuilder
 * �ַ� ���ڿ��� �����ϴ� �۾����� ���
 * String ��ü�� ���ڿ� �߰� �۾� �� ��ü������ �����͸� ���� �� �� ���� ���ڿ��� �߰��� �� ��ü�� �����Ѵ�.
 * ������ �����ʹ� ������ �÷��ǿ� ���� �޸𸮰� �����Ǳ⸦ ��𸮸�, ���ʿ��� �ڿ����� ������ �� �ִ�.
 * �̿� �޸� ������ ���۴� �� Ŭ������ ���� ���ۿ� ���ڿ��� �����ϰ� �� �ȿ��� �߰�,����,������ �����ϵ��� ����Ǿ� �ִ�.
 * ���ڿ� ������ ����� ��� StringŬ������ ���, ������ ���ٸ� StringBuffer�� StringBuilder�� ���
 */

public class Sample_StringBuilder {

	public static void main(String[] args) {
		String s = "Slip inside the eye of your mind";
        StringBuilder sb = new StringBuilder(s); // String -> StringBuilder
        System.out.println("ó�� ���� : " + sb); //ó������ : abcdefg
        System.out.println("���ڿ� String ��ȯ : " + sb.toString()); //String ��ȯ�ϱ�
        System.out.println("���ڿ� ���� : " + sb.substring(2,4)); //���ڿ� �����ϱ�
        System.out.println("���ڿ� �߰� : " + sb.insert(2,"�߰�")); //���ڿ� �߰��ϱ�
        System.out.println("���ڿ� ���� : " + sb.delete(2,4)); //���ڿ� �����ϱ�
        System.out.println("���ڿ� ���� : " + sb.append("Don't you know you might find")); //���ڿ� ���̱�
        System.out.println("���ڿ��� ���� : " + sb.length()); //���ڿ��� ���̱��ϱ�
        System.out.println("�뷮�� ũ�� : " + sb.capacity()); //�뷮�� ũ�� ���ϱ�
        System.out.println("���ڿ� ���� ���� : " + sb.reverse()); //���ڿ� ������
        System.out.println("������ ���� : " + sb); //������ ���� : dnif thgim uoy wonk uoy t'noDdnim ruoy fo eye eht edisni pilS

	}

}
