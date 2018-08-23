package cn.bdqn.sale;

/**
 * ��Ʊ���߳���   ʵ��ͬ��
 */
public class SynchronizedSaleMethod implements Runnable {

	// ������Ʊ��
	private int counts = 1000;

	// �������Ʊ���±�
	private int num = 0;

	// ����һ����ʶ
	private boolean flag = false;

	@Override
	public void run() {
		while (!flag) {
			sale(); // ֻҪ����Ʊ ѭ���ĵ�����Ʊ�ķ���
		}
	}

	// ͬ������
	public synchronized void sale() {
		// ���û��Ʊ �˳�ѭ��
		if (counts <= 0) {
			flag = true;
			return;
		}
		counts--; // ����һ��Ʊ
		num++;
		System.out.println(Thread.currentThread().getName() + "�����˵�" + num
				+ "��Ʊ��ʣ��Ʊ����" + counts);
	}

	/**
	 * ģ��5����ͬʱ��Ʊ
	 */
	public static void main(String[] args) {
		// ʵ�����߳������
		SynchronizedSaleMethod sale = new SynchronizedSaleMethod();
		Thread t1 = new Thread(sale, "С��");
		Thread t2 = new Thread(sale, "С��");
		Thread t3 = new Thread(sale, "С��");
		Thread t4 = new Thread(sale, "С��");
		Thread t5 = new Thread(sale, "С��");
		System.out.println("��ʼ��Ʊ");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
