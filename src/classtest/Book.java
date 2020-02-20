package classtest;

public class Book {
	String name = "abc";

	public void showName(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Book b = new Book();
		b.showName("123");
	}
}
