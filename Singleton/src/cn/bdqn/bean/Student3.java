package cn.bdqn.bean;

public class Student3 {

	// 01.����һ����̬�ı������͵ĳ�Ա����
	private static Student3 stu;

	// 02.˽�л����� �������� �����Ĺ���
	private Student3() {
	}

	// 03.�������ⲿ���ʵĽӿ� ����ֵ �϶�������Student
	public static synchronized Student3 getInstance() {
		if (stu == null) { // ֤���û��ǵ�һ�η���
			synchronized (Student3.class) {
				if (stu == null) { // �ٴ���֤�����Ƿ�Ϊ��
					stu = new Student3();
				}
			}
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
