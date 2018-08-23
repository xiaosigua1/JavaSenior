package cn.bdqn.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Test;

import cn.bdqn.bean.Student;

public class ReflectDemo {

	/**
	 * ȫ�����������޶�����cn.bdqn.test.ReflectDemo
	 *  ����+����
	 *  
	 * ����·��  /Reflect/src/cn/bdqn/test/ReflectDemo.java
	 * 
	 * 
	 * �����޶��� �����Ƿ���Ļ�����
	 * ���⣺
	 *     01.һ�����п��ܳ���������ͬ�����𣿣�  ����
	 *     02.�����޶���������ȷ���������Ψһ��
	 *     03.������ô��ȡ�����޶����أ�
	 */
	@Test
	public void test01() {
		// ���ַ�ʽ��ȡ���ǵ������޶���
		try {
			System.out.println("��һ�ַ�ʽ ��Class.forName()===>"
					+ Class.forName("cn.bdqn.bean.Student").getName());

			System.out.println("�ڶ��ַ�ʽ ������.Class===>" + Student.class.getName());
			System.out.println("�����ַ�ʽ ��������.getClass()===>"
					+ new Student().getClass().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡ��İ���  ���� �������η�
	 */
	@Test
	public void test02() {
		try {
			Class c = Class.forName("cn.bdqn.bean.Student");
			System.out.println("���ڵİ���" + c.getPackage().getName());
			System.out.println("ȫ������" + c.getName());
			System.out.println("��д��������" + c.getSimpleName());

			// ��ȡ������η�
			int num = c.getModifiers();
			System.out.println(num);
			// ͨ��Modifier��toString()�Ϳ��԰�int����ת���ɶ�Ӧ�����η�
			System.out.println(Modifier.toString(num));

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡ�������е������������
	 * 
	 * ���е����ԣ����������췽�� �������η���
	 * ��ͬ�ķ������η� ����Ȩ�޲�һ����
	 * Class���и������ṩ��������������ȡ���ԣ����������췽����
		  01.��ȡ���е�
		           getDeclaredϵ��
		  02.��ȡpublic���ε� 
		           getϵ��
	 */
	@Test
	public void test03() {
		try {
			Class c = Class.forName("cn.bdqn.bean.Student");
			// Field[] fields = c.getFields(); ֻ�ǻ�ȡpublic
			Field[] fields = c.getDeclaredFields(); // ��ȡ����
			for (int i = 0; i < fields.length; i++) {
				System.out.println(fields[i]);
			}

			// ��ȡ�������Եķ������η� default��intֵ��0 û�ж�Ӧ���ַ�������
			for (int i = 0; i < fields.length; i++) {
				System.out.println(Modifier.toString(fields[i].getModifiers()));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��������
	 */
	@Test
	public void test04() {
		// Student stu = new Student(); ���
		try {
			Class c = Class.forName("cn.bdqn.bean.Student");
			Student stu = (Student) c.newInstance(); // ������
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ���ʶ����˽������
	 */

	@Test
	public void test05() {
		try {
			Class c = Class.forName("cn.bdqn.bean.Student");
			Student stu = (Student) c.newInstance();

			Field field = c.getDeclaredField("birthday");
			// �򿪷���˽�����ԵĿ���
			field.setAccessible(true);
			System.out.println(field.get(stu));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ���ʶ����˽�з���
	 */

	@Test
	public void test06() {
		try {
			Class c = Class.forName("cn.bdqn.bean.Student");
			Student stu = (Student) c.newInstance();

			Method method = c.getDeclaredMethod("getSum", double.class);
			method.setAccessible(true);
			// ִ�з���
			double sum = (Double) method.invoke(stu, 50.0);
			System.out.println(sum);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
