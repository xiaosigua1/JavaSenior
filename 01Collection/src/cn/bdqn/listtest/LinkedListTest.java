package cn.bdqn.listtest;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		/**
		 * 02.LinkedList �����õ�������ʽ�洢�ṹ��  �����ɾ����Ч�ʸߣ�
		 *    
		 *    ˭�ܸ����ң�����
		 *    Ϊʲô��ʹ�� 
		 *   List list = new LinkedList();   ���������ָ��������Ķ���
		 *    
		 *   LinkedList list=  new LinkedList();  ʹ�����ַ�ʽ��
		 *   
		 *    List  �� LinkedList ʲô��ϵ��
		 *      001.LinkedList�̳���List��
		 *    List�ӿ����еķ���LinkedList����  
		 *      002. ��
		 *    LinkedList�������еķ�����  List�ӿ�������  !!!!
		 *      003. û�У�
		 *     
		 */
		// ��������
		LinkedList list = new LinkedList();
		// �������Ŷ���
		News news1 = new News(1, "����1");
		News news2 = new News(2, "����2");
		News news3 = new News(3, "����3");
		News news4 = new News(4, "����4");

		// �����б���������Ϣ
		list.add(news1);
		list.addFirst(news2);
		list.add(news3);
		list.addFirst(news4);

		for (Object object : list) {
			News news = (News) object;
			System.out.println(news);
		}

		// ɾ�����һ������
		list.removeLast();
		System.out.println("*********************");
		for (Object object : list) {
			News news = (News) object;
			System.out.println(news);
		}
		// ��ѯĳ��Ԫ���ڼ����е�λ��
		System.out.println("news4�ڼ����е�λ�ã�" + list.indexOf(news4));

	}
}
