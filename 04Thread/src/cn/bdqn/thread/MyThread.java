package cn.bdqn.thread;

public class MyThread {

	/**
	 * ���̵߳����
	 */
	public static void main(String[] args) {
		// ��ȡ��ǰִ�е��߳�
		Thread t = Thread.currentThread();
		System.out.println("��ǰ�̵߳�������====����" + t.getName());
		// �����߳�����
		t.setName("���߳�Main");
		System.out.println("��ǰ�̵߳�������====����" + t.getName());
	}

}
