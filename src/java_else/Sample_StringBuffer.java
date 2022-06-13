package java_else;

/*
 * String��ü�� �ѹ� �Ҵ�� ������ ������ ������ StringBuffer �Ǵ� StringBuilder�� ��ü������ ������ �� ũ�⸦ �ø���.
 * StringBuffer�� ��Ƽ ������ ���¿��� ����ȭ�� �����Ѵ�. StringBuilder ���� ������ ȯ�濡�� ����Ѵ�.
 * �ӵ� : StringBuilder > StringBuffer / ���� : StringBuffer > StringBuilder
 * �ַ� ���ڿ� ������ �ϴ� �۾����� ��� 
 * String ��ü�� ���ڿ��� �߰� �۾� �� ��ü������ �����͸� ���� �� �� ���� ���ڿ��� �߰��� ���ο� ��ü�� �����Ѵ�.
 * ������ �����ʹ� ������ �÷��ǿ� ���� �޸𸮰� �����Ǳ⸦ ��ٸ���.
 * �̿� �ٸ��� ������ ���� �� Ŭ������ ���� ���ۿ� ���ڿ��� �����ϰ� �� �ȿ��� �߰�,����,������ �����ϵ��� ����Ǿ� �ִ�.
 * ���ڿ� ������ ���� ��쿡�� StringŬ������ ����ϸ� �ǰ� ������ ���ٸ� StringBuffer�� StringBuilder�� ����ϸ�ȴ�.
 */

public class Sample_StringBuffer {

	public static void main(String[] args) {
		String s = "ABCDEFU";
		StringBuffer sb = new StringBuffer(s); //string -> stringBuffer�� ��ȯ
		
		System.out.println("ó������ : " + sb); //ó������ -> ABCDEFU
		System.out.println("���ڿ� String ��ȯ : " + sb.toString()); //String ��ȯ�ϱ�
		System.out.println("���ڿ� ���� : " + sb.substring(2,4)); //���ڿ� �����ϱ�
        System.out.println("���ڿ� �߰� : " + sb.insert(2,"�߰�")); //���ڿ� �߰��ϱ�
        System.out.println("���ڿ� ���� : " + sb.delete(2,4)); //���ڿ� �����ϱ�
        System.out.println("���ڿ� ���� : " + sb.append(" and your mom and your sister and your job")); //���ڿ� ���̱�
        System.out.println("���ڿ��� ���� : " + sb.length()); //���ڿ��� ���̱��ϱ�
        System.out.println("�뷮�� ũ�� : " + sb.capacity()); //�뷮�� ũ�� ���ϱ�
        System.out.println("���ڿ� ���� ���� : " + sb.reverse()); //���ڿ� ������
        System.out.println("������ ���� : " + sb); //������ ���� : boj ruoy dna retsis ruoy dna mom ruoy dnaUFEDCBA
	}

}
