package cn.bdqn.bean;

/**
 * ����ʽ  ʵ�� ����
 */
public class Student2 {
	// 01.����һ����̬����Ҫ���óɵ������ ���ԣ�
	private static Student2 student = new Student2();

	// 02.˽�л�����
	private Student2() {
	}

	// 03.����һ�����ⲿ���ʵĽӿ�
	public static synchronized Student2 getInstance() {
		return student;
	}

	private String name; // ����
	private int age; // ����

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// ���Է���
	public static void main(String[] args) {

		// ����3��student����
		Student2 stu1 = Student2.getInstance();
		Student2 stu2 = Student2.getInstance();
		stu2.setName("С��");
		Student2 stu3 = Student2.getInstance();
		stu3.setAge(50);
		System.out.println(stu1 == stu2);
		System.out.println(stu2 == stu3);
		System.out.println(stu1.getName());
		System.out.println(stu1.getAge());

	}

}
