package cn.bdqn.array;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		 * String[] nums = {}; buySomething(nums);
		 */
		String[] nums = { "ơ��", "����", "��Ȫˮ" };
		saleSomething("С��"); // û�ж������Գ���
		saleSomething("С��", nums); // û�ж������Գ���
		saleSomething("С��", "haha1", "haha2", "haha3"); // û�ж������Գ���

	}

	/**
	 * ������˵����������buySomething
	 * ���봫��һ�����飡
	 * ���˵ �û�ȷʵû�в����ɴ��ݣ�
	 * ���ǻ��ô���һ�������� �� ������
	 */
	public static void buySomething(Object[] o) {

	}

	/**
	 *  ...���ص㣺
	 *  
	 *  01.����һ�����飬��ô�������� ��ô���� ...
	 *  02.ֻ��λ�ڲ����б�����һ��λ��
	 *  03.��Ҫ�������ʱ����д
	 *     ����Ҫ��ʱ�򣬲��ô��ݣ�
	 * 
	 */
	public static void saleSomething(String name, String... something) {
		for (String s : something) {
			System.out.println(name + "�ڳ��ۣ�" + s);
		}

	}

}
