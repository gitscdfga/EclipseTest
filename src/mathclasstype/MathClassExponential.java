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
		System.out.println("请输入真数：");
		double a = in.nextDouble();
		System.out.println("请输入底数：");
		double b = in.nextDouble();
		double c = setLogarithm(a, b);
		System.out.println("以" + b + "底数，" + a + "为真数的对数为：" + c);
		in.close();
	}

}
