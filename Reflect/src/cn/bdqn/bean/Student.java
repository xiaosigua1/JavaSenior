package cn.bdqn.bean;

import java.util.Date;

/**
 * ѧ�������ʵ����
 */
public class Student {

	public int age; // ѧ������
	protected String name;// ѧ������
	private Date birthday = new Date();// ѧ������
	char sex; // ѧ���Ա�

	static {
		System.out.println("����Student���еľ�̬�����");
	}

	{
		System.out.println("����Student���е���ͨ�����");
	}

	public Student() {
		System.out.println("����Student���е��޲ι���");
	}

	/**
	 * ˽�еķ���
	 */
	private double getSum(double number) {
		return number + 10;
	}

	public Student(int age, String name, Date birthday, char sex) {
		super();
		this.age = age;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
	}

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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

}
