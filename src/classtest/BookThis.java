/*
 * 此类与Book类所要比较的是this关键字的使用。
 */
package classtest;

public class BookThis {
	String name = "abc";

	public void showName(String name) {
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		BookThis b = new BookThis();
		b.showName("123");
	}
}
