package cn.bdqn.packageclass;

import org.junit.Test;

public class PackageTest {

	// ���еķ�װ�� ���н���Ӧ�Ļ�������������Ϊ�����ķ��� ������ʵ��
	@Test
	public void test01() {
		/**
		 * Float������ʵ�������췽��  �ֱ���  ���� double  float  String
		 * ��������ֵ���Ͷ������ֹ��죡
		 * Characterֻ��һ�����죡
		 */
		Byte a = new Byte((byte) 1);
		Short s = new Short((short) 1);
		Integer b = new Integer(5);
		Long l = new Long(1);
		Float f = new Float(2);
		Double c = new Double(5);
		// �����������װ�඼�̳���Number
		Boolean boolean1 = new Boolean(true);
		Character character1 = new Character((char) 1);
		Character character2 = new Character('1');

	}

	/**
	 * ������װ��̳���Number
	 * ��String������ʵ����ʱ��String�д�ŵı�������ֵ���͵��ַ���
	 * ����Character������ʵ����ʱ��û��String���͵Ĳ�����
	 * ����7�ַ�װ�� �����Դ���һ��Stirng���͵ı�����������ʵ����
	 * ע��㣺
	 *    Stirng���͵ı���������ת������ֵ���ͣ�������׳��쳣(NumberFormatException)��
	 */
	@Test
	public void test02() {
		Byte a = new Byte("1");
		Short s = new Short("1");
		Integer b = new Integer("1");
		Long l = new Long("1");
		Float f = new Float("1");
		Double c = new Double("1");
		// ���˴�Сд��true ����������false
		Boolean boolean1 = new Boolean("");
		System.out.println(boolean1);
		// ���뱨�� Character character1 = new Character("1");
	}

	/**
	*����Character�����ж�Ӧ��parse�ķ���
	*/
	@Test
	public void test03() {
		Integer i = new Integer("5");
		System.out.println(i + 1);
		System.out.println(Integer.parseInt("54321") + 1);
		// ת������ ��2���Ƶ�1011ת����10���Ƶ�����
		System.out.println("10��Ӧ��2���ƣ�" + Integer.parseInt("1011", 2));

		/**    String num = "27";
		    System.out.println(Integer.parseInt(num) + 1);

		    Double.parseDouble("20");
		    Byte.parseByte("1");
		    Short.parseShort("1");
		    System.out.println(1 + 1 + "2"+1); // 221
		    System.out.println("1" + (1 + 2)); // 13
		*/
	}

	@Test
	public void test04() {
		System.out.println(Integer.toBinaryString(28)); // ת����2����
		System.out.println(Integer.toHexString(28)); // ת����16����
		System.out.println(Integer.toOctalString(28)); // ת����8����
	}

	/**
	* valueOf 
	* �ѻ�����������ת���ɶ�Ӧ�ķ�װ��
	* ����Characterû�д���String���͵Ĳ���
	* 
	* xxxValue
	* ��xxx����ת����xxx��Ӧ�Ļ�����������
	*/
	@Test
	public void test05() {
		// �����������ͺͶ�Ӧ��װ��֮���ת�� ���ǳ�֮Ϊ װ��Ͳ������
		int a = 5;
		Integer integer = Integer.valueOf(a); // װ�� �ѻ�����������aת�����˰�װ��integer
		integer.intValue(); // ���� �Ѱ�װ��integerת���ɻ�����������

		Double d = Double.valueOf(20.0);
		double h = d.doubleValue();

		Character character = Character.valueOf('a');
		character.charValue();
	}

	@Test
	public void test06() {
		int a = 127;
		int b = 127;
		System.out.println(a == b);
	}

	@Test
	public void test07() {
		Integer a = new Integer(1);
		Integer b = new Integer(1);
		System.out.println(a == b);
	}

	@Test
	public void test08() {
		/**
		 * Integer a = 127;
		Integer b = 127;
		System.out.println(a == b);  //true
		 */

		Integer a = 128;
		Integer b = 128;
		/**
		 * 01.128��int����  �ǻ�����������
		 * 02.a��integer���� �ǰ�װ��
		 * 03.��ѻ�����������ת���ɰ�װ��
		 * 04.����Ҫʹ��valueOf(128)
		 * 05.�ۿ��ײ�����֪
		 *  
		public static Integer valueOf(int i) {
		assert IntegerCache.high >= 127;
		if (i >= IntegerCache.low && i <= IntegerCache.high)
		    return IntegerCache.cache[i + (-IntegerCache.low)];
		return new Integer(i);    �����Ǵ����ֵ ����127����С��-128�ͻᴴ���¶���
		}
		 */
		System.out.println(a == b);
	}

}
