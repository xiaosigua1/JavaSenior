package cn.bdqn.enumpackage;

public class EnumTest {

	public static void main(String[] args) {
		// ����ѧ������
		Student stu = new Student();
		// ͨ��set������stu����ֵ
		stu.setName("С�ں�");
		stu.setSex(Gender.WOMAN); // ֻ����MAN��WOMAN
		System.out.println(stu.getName() + "���Ա��ǣ�"
				+ stu.getSex().getGenderSex());

	}

}
