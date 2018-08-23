package cn.bdqn.bean;

public class Student2 {

	// 01.����һ����̬�ı������͵ĳ�Ա����
	private static Student2 stu = new Student2(); // ����ʽ

	// 02.˽�л����� �������� �����Ĺ���
	private Student2() {
	}

	// 03.�������ⲿ���ʵĽӿ� ����ֵ �϶�������Student
	public static synchronized Student2 getInstance() {
		return stu;
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
