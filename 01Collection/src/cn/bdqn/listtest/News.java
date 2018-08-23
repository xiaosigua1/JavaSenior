package cn.bdqn.listtest;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ����ʵ����
 */
public class News {

	private int id; // ���ű��
	private String title; // ���ű���

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public News(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public News() {
		super();
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + "]";
	}

	public static void main(String[] args) {
		// ����һ������
		ArrayList list = new ArrayList();
		// �������Ŷ���
		News news1 = new News(1, "����1");
		News news2 = new News(2, "����2");
		News news3 = new News(3, "����3");
		News news4 = new News(4, "����4");

		// �����б���������Ϣ
		list.add(news1);
		list.add(news2);
		list.add(news3);
		list.add(news4);
		// list.add("aaaaaa");ClassCastException ����ת��

		// 01.��1�ַ�ʽ ���� forѭ��
		for (int i = 0; i < list.size(); i++) {
			News news = (News) list.get(i); // ��������ת��
			System.out.println(news);
		}
		System.out.println("*****************************");
		// 02.��2�ַ�ʽ ���� for��ǿѭ��
		for (Object n : list) {
			News news = (News) n; // ��������ת��
			System.out.println(news);
		}
		System.out.println("*****************************");
		/**
		 *  03.��3�ַ�ʽ ���� iterator ������ѭ��
		 *  
		 *  001.hasNext() :�ж����ǵļ������Ƿ���Ԫ��
		 *  002.next��������ȡ�����е���һ��Ԫ��
		 *  003.remove()��ɾ��Ԫ��
		 */
		// �����������
		list.clear(); // �ײ������ ���Ȼ���֮ǰ�ĳ��ȣ�
		// �жϼ����Ƿ�Ϊ��
		System.out.println("�����Ƿ�Ϊ��:" + list.isEmpty());
		Iterator it = list.iterator();
		while (it.hasNext()) {
			News news = (News) it.next();// ��ȡԪ��
			System.out.println(news);
		}

	}

}
