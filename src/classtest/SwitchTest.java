package classtest;

import java.util.Scanner;

public class SwitchTest {
	public int getValue(int i) {
		int result = 0;
		switch (i) {
		case 1:
			result = result + i;
			System.out.println("第一次case时result的值" + result);
		case 2:
			result = result + i * 2;
			System.out.println("第二次case时result的值" + result);
		case 3:
			result = result + i * 3;
			System.out.println("第三次case时result的值" + result);
		}
		return result;
	}

	public SwitchTest() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		SwitchTest j = new SwitchTest();

		System.out.println(j.getValue(i));
	}

}