package cn.bdqn.maptest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Test;

import cn.bdqn.listtest.News;

public class MapTest {

	public static void main(String[] args) {

		/**
		 * Map�� ��һ��key  value ��ֵ�Եļ��ϣ�
		 *       key��Ψһ�ģ�
		 * 
		 * ���ֵ��
		 *  put(key,value)
		 *  
		 * ȡֵ
		 *   get(key)    ����key��ȡvalue
		 */

		Map map = new HashMap();
		map.put(1, "haha1");
		map.put("1", "haha2");
		map.put(new String("1"), "haha3");
		System.out.println(map.size());
	}

	@Test
	public void test1() {
		Map map = new HashMap();
		map.put("news1", new News(1, "���ű���1"));
		map.put("news2", new News(2, "���ű���2"));
		map.put("news3", new News(3, "���ű���3"));
		/**
		 * �������ȡvalue��ֵ   ֻ��ͨ��key
		 * key��һ������ ����set
		 */
		Set keySet = map.keySet();
		for (Object o : keySet) {
			System.out.println(o); // key
		}
		/**
		 * ��ȡ����value�ļ���
		 */
		Collection values = map.values();
		for (Object o : values) {
			System.out.println(o); // value
		}

		System.out.println("****************************");

		// ֱ��ʹ��һ��ѭ�� ��ȡvalue
		for (Object key : keySet) {
			News news = (News) map.get(key); // ����key��ȡvalue
			System.out.println(news);
		}
		System.out.println("****************************");
		Iterator it = keySet.iterator();
		while (it.hasNext()) {
			News news = (News) map.get(it.next());
			System.out.println(news);
		}

		System.out.println("************ EntrySet����****************");

		/**
		 * ǿ���Ƽ�ʹ�� EntrySet����
		 * �����ڻ�ȡkey��ͬʱ��ȡvalue������Ҫ���β�ѯ
		 */
		Iterator it1 = map.entrySet().iterator();
		while (it1.hasNext()) {
			Entry entry = (Entry) it1.next();
			System.out.println("map�е�key��" + entry.getKey());
			System.out.println("map�е�value��" + entry.getValue());
		}
	}

	Logger log = Logger.getLogger(MapTest.class);

	@Test
	public void test2() {
		Map map = new HashMap();
		for (int i = 1; i <= 200000; i++) {
			map.put(i, "" + i);
		}
		System.out.println("map�Ĵ�С��" + map.size());

		// ��ȡ��ǰ�ĺ����� ��1970��1��1�յ����ڵĺ���
		long start = System.currentTimeMillis();
		Set keySet = map.keySet();
		for (Object key : keySet) {
			System.out.println(map.get(key));
		}
		long end = System.currentTimeMillis();
		log.debug("ʹ��forѭ������ʱ��" + (end - start));

		start = System.currentTimeMillis();
		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			System.out.println(entry.getValue());
		}
		end = System.currentTimeMillis();
		log.debug("ʹ��Iteratorѭ������ʱ��" + (end - start));
	}

	/***
	 * 
	 *  HashMap ��  HashTable ������
	 *   01.HashMap    �̲߳���ȫ �������ܸ�
	 *      HashTable  �߳�   ��ȫ �������ܵ�
	 *   02.HashMap �ײ��ǹ�ϣ��ʵ�ֵģ�ÿһ��Ԫ��һ��key -value��ֵ�ԣ�
	 *        key��value������Ϊnull��
	 *      HashTable��key��value��������Ϊnull��
	 *   03.��ʷ�汾��ͬ
	 *      HashMap    1.2
	 *      HashTable  1.0
	 */
}
