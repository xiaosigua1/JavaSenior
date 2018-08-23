package cn.bdqn.bean;

/**
 * 
 * ʧȥһ������,���û�����;��
 *  
 * @author С�а趹��
 * 2017-8-10����11:50:38
 * 
 * 
 * ѧ����ʵ���࣡  
 * ��Ͷ���Ĺ�ϵ��
 *  01.���Ƕ����ģ��   һ������Դ���N������  ==>ԭ�ͣ�������
 *  02.ÿ�������Ƕ�һ�޶��ģ�
 *  
 * ������
 *   ��������ͨ��Student�������ٸ�stu����   
 *   ÿ��stu���� ��ʵ����һ���� 
 *  
 */
public class Student {

	// 01.����һ����̬�ı������͵ĳ�Ա����
	private static Student stu; // ����ʽ

	// 02.˽�л����� �������� �����Ĺ���
	private Student() {
	}

	// 03.�������ⲿ���ʵĽӿ� ����ֵ �϶�������Student
	public static synchronized Student getInstance() {
		if (stu == null) { // ֤���û��ǵ�һ�η���
			stu = new Student();
		}
		return stu; // ���stu���� ֱ�ӷ��� ����Ҫ�ٴδ���
	}

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

}
