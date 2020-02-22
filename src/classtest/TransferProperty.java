/*
 * 传递对象属性。
 */
package classtest;

public class TransferProperty {
	int i = 47; // 定义成员变量。

	public void call() {
		System.out.println("调用call()方法");
		for (i = 0; i < 3; i++) {
			System.out.print(i + " ");
			if (i == 2) {
				System.out.println("\n"); // "\n"为转义字符，建立一个新行的意思。
			}
		}
	}

	public TransferProperty() { // 定义构造方法。

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransferProperty t1 = new TransferProperty(); // 第一个是类名，创建类对象，第二个是调用方法。
		TransferProperty t2 = new TransferProperty();
		t2.i = 60; // 将类成员变量赋值为60。
		/*
		 * 使用第一个对象调用类成员变量。
		 */
		System.out.println("第一个实例对象调用变量i的结果是：" + t1.i++);
		t1.call();// 使用第一个对象调用类成员方法。
		/*
		 * 使用第二个对象调用类成员变量。
		 */
		System.out.println("第二个实例对象调用变量i的结果是：" + t2.i);
		t2.call();// 使用第二个对象调用类成员的方法。
	}

}
