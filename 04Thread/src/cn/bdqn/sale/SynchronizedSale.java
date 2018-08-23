package cn.bdqn.sale;

/**
 * ��Ʊ���߳���   ʵ��ͬ��
 */
public class SynchronizedSale implements Runnable {

	// ������Ʊ��
	private int counts = 10000;

	// �������Ʊ���±�
	private int num = 0;

	@Override
	public void run() {
		while (true) {
			/**
			 * �ڶ���̲߳��������������run������ʱ��
			 * ֻ����һ���߳̽����������synchronized ͬ������飡
			 * ��һ���߳�ִ�����֮��֮����̲߳��ܽ���....��������
			 */
			synchronized (this) {
				// ���û��Ʊ �˳�ѭ��
				if (counts <= 0) {
					break;
				}
				counts--; // ����һ��Ʊ
				num++;
				System.out.println(Thread.currentThread().getName() + "�����˵�"
						+ num + "��Ʊ��ʣ��Ʊ����" + counts);
			}
		}
		synchronized (this) {

		}
	}

	/**
	 * ģ��3����ͬʱ��Ʊ
	 */
	public static void main(String[] args) {
		// ʵ�����߳������
		SynchronizedSale sale = new SynchronizedSale();
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
