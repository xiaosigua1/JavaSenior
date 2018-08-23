package cn.bdqn.bean;

/**
 * ����ʽ  ʵ�� ����
 */
public class Student {
	// 01.����һ����̬����Ҫ���óɵ������ ���ԣ�
	private static Student student;

	// 02.˽�л�����
	private Student() {
	}

	// 03.����һ�����ⲿ���ʵĽӿ�
	public static synchronized Student getInstance() {
		if (student == null) { // �ж϶����Ƿ���ֵ
			student = new Student();
		}
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
		Student stu1 = Student.getInstance();
		Student stu2 = Student.getInstance();
		stu2.setName("С��");
		Student stu3 = Student.getInstance();
		stu3.setAge(50);
		System.out.println(stu1 == stu2);
		System.out.println(stu2 == stu3);
		System.out.println(stu1.getName());
		System.out.println(stu1.getAge());

	}

}
