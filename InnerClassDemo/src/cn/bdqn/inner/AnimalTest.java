package cn.bdqn.inner;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Animal() {// �����ڲ���
			@Override
			public void eat() {
				System.out.println("С����eat");
			}

			@Override
			public void sleep() {
				System.out.println("С����sleep");
			}
		};

		dog.eat();
		dog.sleep();
	}

}
