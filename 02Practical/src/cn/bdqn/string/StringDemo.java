package cn.bdqn.string;

import org.junit.Test;

public class StringDemo {

	@Test
	public void test01() {
		String a = "abc";
		String b = "ABC";
		System.out.println("�ַ����ĳ��ȣ�" + a.length());
		System.out.println("�ַ����Ƿ���ȣ�" + (a == b));
		System.out.println("�ַ��������Ƿ�һ��(���ִ�Сд)��" + (a.equals(b)));
		System.out.println("�ַ��������Ƿ�һ��(�����ִ�Сд)��" + (a.equalsIgnoreCase(b)));
		System.out.println("��abc��ɴ�д��" + a.toUpperCase());
		System.out.println("��ABC��ɴ�д��" + b.toLowerCase());
	}

	@Test
	public void test02() {
		String a = "abcdefg";
		// ���ַ���ת����char���͵�����
		char[] newArray = a.toCharArray();
		for (char c : newArray) {
			System.out.println(c);
		}
	}

	@Test
	public void test03() {
		String a = "a+b?c?d-e?f?g";
		/**
		 *  ��һ�����ص���ַ�����ֳ�һ��Stirng���͵�����
		 *  �˽� ������ʽ  �������н���
		 */
		String[] newStringArr = a.split("-");
		for (String s : newStringArr) {
			System.out.println(s);
		}
	}

	@Test
	public void test04() {
		String a = "501804392@qq.com.cn";
		// indexOf("@") ����@���ַ����е��±� ���û�� ����-1
		int index = a.indexOf("@");
		System.out.println("@���ַ����г��ֵ�λ���ǣ�" + index);
		// �������������. �ҵ����һ�����λ��
		index = a.lastIndexOf(".");
		System.out.println(".���ַ����������ֵ�λ���ǣ�" + index);
	}

	@Test
	public void test05() {
		String a = "0123456789";
		// ֻ���ȡ6789 substring(6) ���±�Ϊ6�Ŀ�ʼ��ȡ��������
		a = a.substring(6);
		System.out.println(a);
		/**
		 *  ֻ���ȡ456 
		 *  substring(4, 7)  
		 *  4:���ǿ�ʼ��ȡ��λ��  ��������
		 *  7�����ǽ�ȡ������λ�� ����������
		 */
		a = "0123456789";
		a = a.substring(4, 7);
		System.out.println(a);
	}

	@Test
	public void test06() {
		String a = "0123456789";
		// ��5����+
		a = a.replace("5", "+");
		System.out.println(a);
	}

	@Test
	public void test07() {
		String a = "01234a6789";
		// �����±�λ�õ� Ԫ��
		char b = a.charAt(5);
		System.out.println(b);
	}

	@Test
	public void test08() {
		String a = "01234";
		String b = "56789";
		System.out.println(a + b);
		System.out.println(a.concat(b));
	}

	@Test
	public void test09() {
		String a = "01234";
		// �Ƿ����ĳ���ַ� ��������ڷ���false
		System.out.println(a.contains("0"));
	}

	@Test
	public void test10() {
		String a = "abcde";
		byte[] bytes = a.getBytes();
		for (byte b : bytes) {
			System.out.println((char) b);
		}
	}

	@Test
	public void test11() {
		String a = new String("abc").intern();
		/**
		 * intern() :  ˵  ��aָ���� �������еġ�abc��
		 */
		String b = new String("abc");
		String c = "abc";
		System.out.println(a == c);
	}

	@Test
	public void test12() {
		// 01.�������
		String name = "xiaohei";
		// 02.��������ַ����Ĵ���
		int count = 2000000;
		// 03.���ÿ�ʼʱ��
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < count / 100; i++) { // 20000��
			name += "haha";
		}
		// 03.���ý���ʱ��
		long endTime = System.currentTimeMillis();
		System.out.println("String��ִ��ʱ�䣺" + (endTime - beginTime));
		System.out.println("****************************");
		name = "xiaohei";
		// 04.ʹ��StringBuffer
		StringBuffer buffer = new StringBuffer(name);
		beginTime = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			buffer = buffer.append("haha");
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer��ִ��ʱ�䣺" + (endTime - beginTime));
		System.out.println("****************************");
		name = "xiaohei";
		// 05.ʹ��StringBuilder
		StringBuilder builder = new StringBuilder(name);
		beginTime = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			builder = builder.append("haha");
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder��ִ��ʱ�䣺" + (endTime - beginTime));

	}
}
