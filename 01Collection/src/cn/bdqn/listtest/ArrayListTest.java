package cn.bdqn.listtest;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		/**
		 * �ڳ������й�����,��ȷ���ж��ٸ�����  ���뵽 ������!
		 * ʹ�ü��Ͽ��!
		 * ���� ������ ����   LinkedList
		 * ���� ������ ��ѯ   ArrayList
		 * ������������  ����  List�ӿڵ� ʵ���࣡
		 * 
		 * 01. ArrayList �ײ���ʵ����һ���ɱ䳤�ȣ��Զ����ݣ������飡
		 *     ���ڴ���Ҳ�Ƿ��������Ŀռ䣡
		 *     ����Ԫ�غ��������Ԫ�ص�ʱ�� ���ܸߣ�  ��Ϊ���±꣡
		 */

		// 01����һ��ArrayList����
		ArrayList list = new ArrayList();
		/**
		 *  02. �򼯺�������Ԫ��
		 *    Ϊʲô���Դ����ô����������
		 *    ��Ϊ�ײ����һ��Object[]����   Ĭ�ϵĳ�ʼ����=10
		 *    Object ������ĸ��࣬���Կ��Դ���κ����ͣ�
		 *  
		 */
		list.add(1);
		list.add("2");
		list.add(12.5);
		list.add('5');
		list.add('1');
		list.add(null);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11); // �Զ����� ԭ�����ȵ�1.5��
		// 03.������ϵĳ��� ʵ��ʹ�õ�λ�ø���
		System.out.println(list.size());
		// 04. ��ѯ�������±���3 ��Ԫ��
		System.out.println("�������±���3 ��Ԫ��:" + list.get(3));
		// 05. ɾ���±�Ϊ5��Ԫ��
		list.remove(5);
		System.out.println("ɾ��Ԫ��֮��ĳ��ȣ�" + list.size());
		// 06.��ѯ�������Ƿ����ĳ��Ԫ��
		System.out.println("�������Ƿ����12.5��" + list.contains(12.5));
	}
}
