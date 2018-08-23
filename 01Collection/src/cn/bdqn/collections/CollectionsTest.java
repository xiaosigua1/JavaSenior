package cn.bdqn.collections;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import org.junit.Test;

public class CollectionsTest {

	/**
	 *Collections �������м��ϵĹ�����
	 *
	 *����ĸ�����ֽ�������
	 */
	@Test
	public void test01() {
		List<String> list = new ArrayList<>();
		list.add("z");
		list.add("g");
		list.add("a");
		list.add("c");
		System.out.println(list);
		// 01.����
		Collections.sort(list);
		System.out.println("����=====��" + list);
		// 02.����
		Collections.reverse(list);
		System.out.println("����=====��" + list);
		// 03.��ѯԪ���ڼ����е�һ��λ�� ������������
		Collections.sort(list);
		int index = Collections.binarySearch(list, "z");
		System.out.println("z���ֵ�λ�ã�" + index);
		// 04.�������
		Collections.shuffle(list);
		System.out.println("�������֮��ļ��ϣ�" + list);
	}

	// �����������
	@Test
	public void test02() {
		List<News> list = new ArrayList<>();
		list.add(new News(3, "����3"));
		list.add(new News(4, "����4"));
		list.add(new News(1, "����1"));
		list.add(new News(2, "����2"));
		/**
		 * ���ݶ����id����  ����������
		 * 01.���������� ��Ҫʵ��  Comparable
		 */
		for (News news : list) {
			System.out.println(news);
		}
		System.out.println("================����֮��===============");
		Collections.sort(list);
		for (News news : list) {
			System.out.println(news);
		}
	}

	@Test
	public void test03() {
		String[] a = { "a", "b", "c", "d", "e", "c", "d" };
		// ������ת���ɼ���
		List<String> list = Arrays.asList(a);
		String[] b = { "c", "d" };
		List<String> list2 = Arrays.asList(b);
		// ��ѯlist2��list�� �״γ��ֵ�λ��
		System.out.println(Collections.indexOfSubList(list, list2));
		System.out.println(Collections.lastIndexOfSubList(list, list2));
	}

	@Test
	public void test04() {
		String[] a = { "a", "b", "c", "d", "e" };
		// ������ת���ɼ���
		List<String> list = Arrays.asList(a);
		// list����������Ԫ�غ���2λ ����Ĳ��ֲ���ǰ��
		Collections.rotate(list, 2);
		System.out.println(list);
	}

	// �����Ľ�������
	@Test
	public void test05() {
		List<String> list = new ArrayList<String>();
		list.add("e��");
		list.add("d˵");
		list.add("a��");
		list.add("b��");
		list.add("c��");
		Comparator<Object> c = Collator.getInstance(Locale.CHINA);
		Collections.sort(list, c);
		System.out.println(list);

	}

}
