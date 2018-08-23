package cn.bdqn.settest;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class StringTest {

	public static void main(String[] args) {

		Set set = new HashSet();
		set.add("1");
		set.add(new String("1"));
		set.add(new String("1"));
		System.out.println(set.size());

		// ���ʣ� Ϊʲô ����new ȷ��һ����
		String a = new String("1");
		String b = new String("1");
		String c = "1";
		System.out.println(a == b);
		System.out.println(a == c);
		// ������ͬ��String���� hashCode��һ�µģ�
		System.out.println(a.hashCode() == b.hashCode());
		System.out.println(a.hashCode() == c.hashCode());
	}

	@Test
	public void test1() {
		String a = new String("1");
		/**
		 * 01.������ջ�п��ٿռ�洢a
		 * 02.ȥ�������в�ѯ��û�� �ַ���1 û�о��ڳ������д����ַ���1
		 * 03.��ȥ���д���һ���ַ���1
		 * 04.aָ����е��ַ���1
		 */
		String b = "1";
		/**
		 * 01.������ջ�п��ٿռ�洢b
		 * 02.ȥ�������в�ѯ��û�� �ַ���1   ��
		 * 03.bָ�������е��ַ���1
		 */
		System.out.println(a == b); // false
	}

	@Test
	public void test2() {
		String a = "abc";
		String b = "abc";
		System.out.println(a == b); // true
		System.out.println(a == "abc"); // true
	}

	@Test
	public void test3() {
		String a = "abc";
		String b = "a";
		String c = "bc";
		System.out.println(a == ("a" + "bc")); // true
		/**
		 * b  ��  c  ���Ǳ���������������
		 * �������ڼ���Ըı������
		 */
		System.out.println(a == (b + c)); // false
	}

	@Test
	public void test4() {
		String a = "abc";
		final String b = "a";
		final String c = "bc";
		System.out.println(a == ("a" + "bc")); // true
		/**
		 * �ڱ����ڼ���Ϊb  ��  c  ���ǳ���
		 * ���ԾͰ�b+c="abc"
		 */
		System.out.println(a == (b + c)); // true
	}
}
