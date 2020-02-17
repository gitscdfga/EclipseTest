package homework;

public class SumTest {
	public static void sum(int a,int b) {
		int i;
		int sum;
		sum = 0;
		for(i=a;i<=b;i++) {
			sum += i;
		}
		System.out.println(a+"dao"+b+"de he wei"+sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10,20);
		sum(30,40);
		sum(50,60);
	}

}
