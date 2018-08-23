package cn.bdqn.genericity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import cn.bdqn.listtest.News;

public class MyTest {

	@Test
	public void test01() {
		ArrayList list = new ArrayList();
		// list�п��Դ��ʲô���ͣ� Object ��������
		list.add(1);
		list.add("1");
		list.add(new Date());
		/**
		 *  ������ôȥ������Щ���͵�����
		 *  01.�����е����ݲ�����ͬ����
		 *  02.���ܰ���һ�ַ�ʽȥ����
		 */

		Set set = new HashSet();
		set.add(1);
		set.add("1");
		set.add(new Date());

		Map map = new HashMap();
		map.put(1, "1");
		map.put("1", "haha");
		map.put("2", new Date());

		/**
		 * �������� ���� 
		 * 01.��Ϊ����û���ڴ������ϵ�ͬʱ �涨�����п��Դ��ʲô���͵�����
		 * 02.���Լ����п��Դ��Object���͵�����
		 * 03.���º����������鷳
		 * 04.����������ȡ�����е�ĳ��Ԫ�أ���Ҫʹ��get����
		 * 05.����get()����ֵ�� object����
		 * 06.��Ҫ����ת�ͣ�ת����ָ�������ͣ�֮����ܲ�����
		 * 
		 * 
		 * ��û��һ�ַ�ʽ��
		 * 01.�����ڴ������ϵ�ʱ�򣬹涨������ֻ�ܴ��ʲô����
		 * 02.�ܲ�����get()����������ת�ͣ�����
		 * 
		 * �ܣ�
		 * ʹ�÷��ͣ�
		 * ���ͼ��ϣ�  �������ϵ�ʱ�򣬹涨�����д�����ݵ����ͣ�
		 * 
		 */

	}

	/**
	 *  ʹ�÷��ͼ���   ����+��ȫ
	 *  <> ���Ǽ�����ָ����Ԫ�����ͣ�
	 *  
	 *  ���ͼ����� ������ ��Ż����������͵�Ԫ�أ�
	 *  ������Ż����������ͣ�
	 *  ����ʹ�û����������Ͷ�Ӧ�� ��װ��
	 *  
	 *  java����8�ֻ�����������,ʹ��ctrl+������   �㲻��ȥ�� ˵��������
	 *   
	 *  �Ǿ���8����Ӧ�İ�װ�࣡
	 *  byte    Byte
	 *  short   Short
	 *  int     Integer        
	 *  long    Long
	 *  float   Float
	 *  double  Double
	 *  
	 *  boolean  Boolean
	 *  char     Character
	 *  
	 */
	@Test
	public void test02() {
		ArrayList<String> list = new ArrayList<String>();
		// ˵��list������ֻ�ܴ��String���͵�����
		// list.add(new Date()); ���뱨��
		ArrayList<News> list2 = new ArrayList<News>();
		// list2������ ֻ�ܴ�� News ����
		ArrayList<Double> list3 = new ArrayList<Double>();
		list3.add(2.0);

		double a = 2;
		// Double b = 2; ���뱨��
	}

	@Test
	public void test03() {
		/**
		 * ������һ��map���ͼ��ϣ�
		 * ���ϵ�keyֻ����String����
		 * valueֻ����News���ͣ�
		 * 
		 * map.put(1,"1"); ����
		 * map.put("1","1"); ����
		 * map.put("1",new News());
		 */
		Map<String, News> map = new HashMap<>();
		News news1 = new News(1, "����1");
		News news2 = new News(2, "����2");
		News news3 = new News(3, "����3");
		map.put("a", news1);
		map.put("b", news2);
		map.put("c", news3);

		// �����������е�������Ϣ
		Iterator<Entry<String, News>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, News> entry = iterator.next();
			// System.out.println(entry.getKey()); ��ȡ���е�key
			News news = entry.getValue(); // ��ȡ���е�value
			System.out.println(news);
		}

	}
}
