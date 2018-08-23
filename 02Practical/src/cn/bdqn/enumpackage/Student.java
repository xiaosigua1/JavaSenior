package cn.bdqn.enumpackage;

/**
 * ѧ����ʵ����
 */
public class Student {

	private String name;
	private Gender sex; // ö�����͵��Ա�

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getSex() {
		return sex;
	}

	public void setSex(Gender sex) {
		this.sex = sex;
	}

	public Student(String name, Gender sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + "]";
	}

}
