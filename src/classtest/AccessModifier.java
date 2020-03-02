/*
 * 尝试编写一个类，
 * 定义一个修饰权限为private的成员变量，
 * 并定义两个成员方法，
 * 一个成员方法实现为此成员变量赋值，
 * 另一个成员方法获取这个成员变量的值，
 * 保证其他类继承该类时能获取该类的成员变量的值。
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
