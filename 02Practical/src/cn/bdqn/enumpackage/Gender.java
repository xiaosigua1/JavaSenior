package cn.bdqn.enumpackage;

/**
 * ������Ա��ö����
 */
public enum Gender {

	// ��Ҫ����ö��ֵ
	MAN("��"), WOMAN("Ů");

	private String genderSex;

	private Gender(String name) {
		this.genderSex = name;

	}

	public String getGenderSex() {
		return genderSex;
	}

	public void setGenderSex(String genderSex) {
		this.genderSex = genderSex;
	}

}
