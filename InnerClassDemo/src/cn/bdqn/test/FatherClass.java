package cn.bdqn.test;

public class FatherClass { // �ⲿ��
	private static int age = 5;
	private int num = 5000;

	class Son { // ��Ա�ڲ���
		int age = 50;
		private int num = 5;

		public void sayHello() {
			System.out.println(FatherClass.this.num);
		}
	}

	// �ⲿ��ķ���
	public void getSon() {
		class Son { // ����౻��������һ�������� ===���ֲ��ڲ���
			public void sayBye() {
				System.out.println("�ټ��ˣ��ϴ�磡");
			}
		}
		Son son = new Son(); // �����ڱ�������ʹ��
		son.sayBye();
	}

	// ��̬�ڲ���

	static class Son2 {
		public void sayBye() {
			System.out.println("�ټ��ˣ�Son2��̬�ڲ���");
		}
	}
}
