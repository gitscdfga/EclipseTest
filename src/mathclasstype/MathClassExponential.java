package mathclasstype;

import java.util.Scanner;

public class MathClassExponential {
	private static double setLogarithm(double a, double b) {
		double c = 0;
		c = Math.log(a) / Math.log(b);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("������������");
		double a = in.nextDouble();
		System.out.println("�����������");
		double b = in.nextDouble();
		double c = setLogarithm(a, b);
		System.out.println("��" + b + "������" + a + "Ϊ�����Ķ���Ϊ��" + c);
		in.close();
	}

}
