/*
 * ���Ա�дһ���࣬
 * ����һ������Ȩ��Ϊprivate�ĳ�Ա������
 * ������������Ա������
 * һ����Ա����ʵ��Ϊ�˳�Ա������ֵ��
 * ��һ����Ա������ȡ�����Ա������ֵ��
 * ��֤������̳и���ʱ�ܻ�ȡ����ĳ�Ա������ֵ��
 */
package classtest;

public class AccessModifier {
	private String name;

	private AccessModifier() {
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getName() {
		int id = 0;
		setName("Java");
		return id + this.name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier t1 = new AccessModifier();
		t1.setName("ok");
		t1.getName();
	}

}
