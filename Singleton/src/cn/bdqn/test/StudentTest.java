package cn.bdqn.test;

import cn.bdqn.bean.Student3;

public class StudentTest {
	/**
	            �������ѧ������
		Student stu1 = new Student(1, "С��");
		Student stu2 = new Student(2, "С��");
		Student stu3 = new Student(3, "���");
		 �ı�stu2������
		stu2.setName("С��2");
		 ��ȡstu3������
		System.out.println(stu3.getName());
	 */
	public static void main(String[] args) {
		/**
		 * ��ʵ�ֵ�Ч��    �������Ǹı����ĸ���������ԣ������Ķ���������֮�ı䣡����
		 *  ����ʹ�õ�����
		 */
		Student3 stu1 = Student3.getInstance();
		// ��stu1�����age��ֵ
		stu1.setAge(50);
		Student3 stu2 = Student3.getInstance();
		// ��stu2�����name��ֵ
		stu2.setName("�����˹��������");
		Student3 stu3 = Student3.getInstance();
		// ���stu3������
		System.out.println(stu3.getAge());
		System.out.println(stu3.getName());
		System.out.println(stu1 == stu2); // true

	}
}
