package cn.bdqn.settest;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		/**
		 * Set ��
		 *   01.�洢����Ψһ�������ظ��� ��������ݣ�
		 *   02.HashSet�ǳ��õ�ʵ����
		 *   03.��ŵ��Ƕ��������
		 */

		Set set = new HashSet();
		set.add(1);
		set.add("1");
		set.add('1');
		set.add(null);
		System.out.println(set.size()); // ������ϵĴ�С 4

		Set set2 = new HashSet();
		set2.add(1);
		set2.add(1);
		set2.add(1);
		System.out.println(set2.size()); // ������ϵĴ�С 1

		/**
		 *  ͨ���ۿ��ײ�����֪��                                        
			private transient HashMap<E,Object> map; 
			 public boolean add(E e) {               
			      return map.put(e, PRESENT)==null;  
			  }  
		 01.HashSet	���� ��һ�������� map  ��ֵ������ HashMap
		 02.������ʹ��add(e) ����ʵ�ǵ�����map.put(e,PRESENT)
		      ��e������map��keyֵ��
		      ��ΪMap��key��Ψһ�ģ� �������ǵ�hashSet�洢��Ҳ��Ψһ�ģ�
		 03.��ô��ô֪��	map�е�key��Ψһ���أ� ��hashMap��put()  
		 
		   String�ĵײ� �� char���͵����飡
		   ��ô�Ƚ�����ֵ�Ƿ�һ�£�  ��char�����е�ÿһ��Ԫ�ض��Ƚϣ�ȫ���  ����ȣ�
		   
		   ����hashMap��������ݵ�ʱ��
		   01.�Ƚ���hash����
		   02.�Ѽ����ֵ���������е��±�
		   03.�ж��±�ָ�������Ԫ���Ƿ�Ϊ�գ����Ϊ�� ֱ�� �������
		   04.�����Ϊ��
		           ���β�ѯentry�е�����Ԫ��
		   05.�ж�key�Ƿ����
		        001.e.hash == hash
		        002.(k = e.key) == key || key.equals(k)
		      ������  ֱ�Ӹ���
		   ����� ͨ��next�ı��� ��ֵ ������entry��  
		   
		   
		   
		   
		   HashSet �� TreeSet������
		   
		  01. HashSet�ײ��ǹ�ϣ��ʵ�ֵģ�
		      TreeSet�ײ��Ƕ�����ʵ�ֵģ�
		  02. HashSet��ŵ�����������ģ�
		      TreeSet��ŵ�����������ģ�
		  03. HashSet���Դ�� null������ֻ����һ��null!
		      TreeSet�����Դ��null��
		  04. HashSet�ײ�����HashMapʵ�֣� 
		      TreeSet�ײ�����TreeMapʵ�֣� 
		  05. HashSet���̲߳���ȫ�ģ� ���߳��ǰ�ȫ��
		      TreeSet���̰߳�ȫ�ģ�   
		   
		 */

	}

}
