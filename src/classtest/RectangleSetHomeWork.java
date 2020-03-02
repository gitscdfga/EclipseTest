/*
 * 尝试编写一个矩形类，
 * 将长与宽作为矩形类的属性，
 * 在构造方法中将长、宽初始化，
 * 定义一个成员方法求矩形的面积。
 */
package classtest;

import java.util.Scanner;

public class RectangleSetHomeWork {
	private double recLength;
	private double recWide;

	private RectangleSetHomeWork() {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入矩形的长：");
		this.recLength = in.nextDouble();
		System.out.println("请输入矩形的宽：");
		this.recWide = in.nextDouble();
		in.close();
	}

	private void recArea() {
		double recArea = this.recLength * this.recWide;
		System.out.println("矩形的面积为：\n" + recArea);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleSetHomeWork t1 = new RectangleSetHomeWork();
		t1.recArea();
	}

}
