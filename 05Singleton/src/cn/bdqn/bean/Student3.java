package cn.bdqn.bean;

/**
 * ˫����  ʵ�� ����
 */
public class Student3 {
	// 01.����һ����̬����Ҫ���óɵ������ ���ԣ�
	private static Student3 student;

	// 02.˽�л�����
	private Student3() {
	}

	// 03.����һ�����ⲿ���ʵĽӿ�
	public static synchronized Student3 getInstance() {
		if (student == null) {
			synchronized (Student3.class) {
				if (student == null) {
					student = new Student3();
				}
			}
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
		Student3 stu1 = Student3.getInstance();
		Student3 stu2 = Student3.getInstance();
		stu2.setName("С��");
		Student3 stu3 = Student3.getInstance();
		stu3.setAge(50);
		System.out.println(stu1 == stu2);
		System.out.println(stu2 == stu3);
		System.out.println(stu1.getName());
		System.out.println(stu1.getAge());

	}

}
