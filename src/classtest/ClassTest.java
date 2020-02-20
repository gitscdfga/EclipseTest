/*
 * 类的构造方法
 * 如果在java中无类的构造方法，
 * 那么系统会建立一个无参数的构造方法，
 * 此时可用代码体现，
 * 也可不体现，
 * 如果人为构造了一个有参数的类方法，
 * 那么在调用类方法的时候必须有值。
 */
package classtest;

public class ClassTest {
	public ClassTest(int a) {
		//有参构造方法。
	}
	public ClassTest() {
		//无参数构造方法。
	}
	public static void main(String[] args) {
		ClassTest a = new ClassTest(5);
		ClassTest b = new ClassTest();
	}
}
