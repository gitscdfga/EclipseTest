/*
 * ���Ա�дһ�������࣬
 * ���������Ϊ����������ԣ�
 * �ڹ��췽���н��������ʼ����
 * ����һ����Ա��������ε������
 */
package classtest;

import java.util.Scanner;

public class RectangleSetHomeWork {
	private double recLength;
	private double recWide;

	private RectangleSetHomeWork() {
		Scanner in = new Scanner(System.in);
		System.out.println("��������εĳ���");
		this.recLength = in.nextDouble();
		System.out.println("��������εĿ�");
		this.recWide = in.nextDouble();
		in.close();
	}

	private void recArea() {
		double recArea = this.recLength * this.recWide;
		System.out.println("���ε����Ϊ��\n" + recArea);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleSetHomeWork t1 = new RectangleSetHomeWork();
		t1.recArea();
	}

}
