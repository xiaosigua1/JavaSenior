package cn.bdqn.sale;

/**
 * ��Ʊ���߳���
 */
public class Sale implements Runnable {

	// ������Ʊ��
	private int counts = 100;

	// �������Ʊ���±�
	private int num = 0;

	@Override
	public void run() {
		while (true) {
			// ���û��Ʊ �˳�ѭ��
			if (counts <= 0) {
				break;
			}
			counts--; // ����һ��Ʊ
			num++;
			System.out.println(Thread.currentThread().getName() + "�����˵�" + num
					+ "��Ʊ��ʣ��Ʊ����" + counts);
		}
	}

	/**
	 * ģ��3����ͬʱ��Ʊ
	 */
	public static void main(String[] args) {
		// ʵ�����߳������
		Sale sale = new Sale();
		Thread t1 = new Thread(sale, "С��");
		Thread t2 = new Thread(sale, "С��");
		Thread t3 = new Thread(sale, "С��");
		System.out.println("��ʼ��Ʊ");
		t1.start();
		t2.start();
		t3.start();

	}

}
