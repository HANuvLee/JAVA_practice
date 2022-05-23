package java_else;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * ���÷����� ��ü���� Ŭ���� Ÿ���� ���� ���ϴ��� �� Ŭ������ �޼���, Ÿ��, �����鿡 ������ �� �ֵ��� ���ִ� �ڹ� API�̴�.
 * ������ �ð��� �ƴ� ���� �ð��� �������� Ư�� Ŭ������ ������ ������ �� �ִ� ���α׷��� ����̴�.
 * �������� Ŭ������ ����ؾ��� �� �ʿ��ϴ�.
 * �ٽ� ���� �ۼ� �������� ��� Ŭ������ ����ؾ� ���� ������ ��Ÿ�� �������� Ŭ������ �����ͼ� �����ؾ��ϴ� ��� �ʿ�.
 */

class ReflectionTest {
	  private String name;
	  private String gender;
	  private Tool use;

	  public enum Tool{
	    INTELLIJ, ECLIPSE
	  }
	  
	  public ReflectionTest() { 
	  
	  }
	  
	  private ReflectionTest(Tool use) { //private ������
	    setUse(use);
	    System.out.println("Tool : " + getUse());
	  }
	  
	  private void setNameAndUse(String name, Tool use) { //private �޼ҵ�
	    setName(name);
	    setUse(use);
	  }
	  
	  public Tool getUse() {
	    return use;
	  }

	  public void setUse(Tool use) {
	    this.use = use;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getGender() {
	    return gender;
	  }

	  public void setGender(String gender) {
	    this.gender = gender;
	  }
	}
  
public class Sample_Reflection {

	public static void main(String[] args){
		/*
		ReflectionTest ��ü �������� 3���� ��� => Ŭ���� ������ ������ ��� ���� �ڹٿ��� �����ϴ� API�� �ִ�. �ٷ� 'java.lang.class'�̸� �̸� �̿��Ͽ� Ŭ������ ��ü�� �޴´�.
		1 - Class refClass1 = ReflectionTest.class; ==>  class�� ���̴� �� ����� �ش� Ŭ������ �ٷ� ����

		2 - ReflectionTest reflectionTest = new ReflectionTest();  ==> ��ü ���� ��, getClass()��� �޼��带 �̿��ϴ� ���
			Class refClass2 = reflectionTest.getClass();
		
		***1���� 2�� ����� �� �� ������̸� 3�� ����� ����ó������ ���� �ڵ带 �ۼ� �� �� ����***
		3 - try {
				Class refClass3 = Class.forName("java_else.ReflectionTest"); ==> forName() �޼��带 �̿��Ͽ� ��ȣ �ȿ� ����� Ŭ������ �ε��ϴ� ���
			} catch (Exception e) {
				e.printStackTrace();
			}
		*/
		
		 Class refClass = null;

	      try {
	      	refClass = Class.forName("java_else.ReflectionTest");
	      } catch (ClassNotFoundException e) {
	      	e.printStackTrace();
	      }

		  /*��ü ������ ���� ������ ���� ��������*/
		   /*�������� ������ �������� �޼���*/
		   /*  getConstructors() : �ش� Ŭ������ public���� ����� ��� �����ڸ� �迭�� ���·� ��ȯ�Ѵ�.*/
		   /*  getDeclaredConstructors() : �ش� Ŭ������ ����� ��� �����ڸ� �迭�� ���·� ��ȯ�Ѵ�. ���⿡�� private���� ����� �����ڵ� ���Եȴ�.*/
	      System.out.println("------------------getConstructors() �޼���------------------");
	      Constructor[] refConstructors = refClass.getConstructors();
	      for(int i=0; i<refConstructors.length; i++) {
	        System.out.println(refConstructors[i].toString());
	      }
	    
	      System.out.println("------------------getDeclaredConstructors() �޼���------------------");
	      Constructor[] refDecConst = refClass.getDeclaredConstructors(); // =>getDeclaredConstructors()�� ������ ���, private���� ����� �����ڿ��� ����
	      for(int i=0; i<refDecConst.length; i++) {
	      	System.out.println(refDecConst[i].toString());
	      }
	      
	      /*�޼��� ���� ��������*/
	       /*Class Ŭ�������� �����ϴ� �޼���*/
		   /*  getMethods() : public���� ����� ��� �޼��� ��ϰ� �ش� Ŭ�������� ��ӹ��� �޼��忡 �����Ѵ�.
	       /*  getDeclaredMethods() : �ش� Ŭ�������� ����� �޼��� ������ ��ȯ�Ѵ�. �翬�� ���⿡�� private���� ����� �޼��嵵 ���Եȴ�.*/
	      System.out.println("------------------getMethods() �޼���------------------");
	      Method[] refMethod = refClass.getMethods();
	      for(int i=0; i<refMethod.length; i++) {
	        System.out.println(refMethod[i].toString());
	      }

	      System.out.println("------------------getDeclaredMethods() �޼���------------------");
	      Method[] refDecMethod = refClass.getDeclaredMethods(); //getDeclaredMethods()�� ������ ��쿡�� setNameAndUse()��� private���� ����� �޼��忡 ����
	      for(int i=0; i<refDecMethod.length; i++) {
	      	System.out.println(refDecMethod[i].toString());
	      }
	      
	      /*���� ���� ��������*/
	       /*Class Ŭ�������� �����ϴ� �޼���*/
		   /*  getFields() : public���� ����� ���� ����� Field Ÿ���� �迭�� ��ȯ�Ѵ�.
		   /*  getDeclaredFields() : �ش� Ŭ�������� ���� �� ��� ���� ����� �迭�� ���·� ��ȯ�Ѵ�.*/
	      System.out.println("------------------getFields() �޼���------------------");
	      Field[] refFields = refClass.getFields(); 
	      for(int i=0; i<refFields.length; i++) {
	        System.out.println(refFields[i].toString());
	      }
	        
	      System.out.println("------------------getDeclaredFields() �޼���------------------");
	      Field[] refDecFields = refClass.getDeclaredFields();
	      for(int i=0; i<refDecFields.length; i++) {
	      	System.out.println(refDecFields[i].toString());
	      }
	      //ReflectionTest Ŭ������ ����� �������� ���� private�̾��� ������ getDeclaredFields() �޼���� ��� ������ ������ ����������,
	      //getFields() �޼���� �ƹ��͵� �����س��� ���ϴ� ���� �� �� �ִ�.
	}

}
