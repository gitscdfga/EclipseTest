package classtest;

public class LikeABird {
	/*
	 * 以下代码为定义成员变量。
	 */
	String wing;//定义翅膀变量。
	String claw;//定义爪子变量。
	String beak;//定义喙（hui）变量。
	String feather;//定义羽毛变量。
	String name;//此为成员方法代码中定义的name变量。
	/*
	 * 以下代码为构造成员方法，java中类的行为，
	 * gaze为凝视，目标为target，
	 * run为奔跑，
	 * eat为吃，meat为肉,
	 * sleep为睡觉。
	 */
	public void gaze(String target)
	{
		//方法体。
	}
	public void run() 
	{
		//方法体。
	}
	public void eat(String meat) 
	{
		//方法体。
	}
	public void sleep() 
	{
		//方法体。
	}
	/*
	 * 如果在成员方法内定义一个变量，
	 * 那么这个变量被称为局部变量，
	 * 局部变量在方法执行时创建，在方法执行结束时被销毁，
	 * 局部变量在进行使用时必须进行赋值操作或被初始化，
	 * 否则会出现编译错误，
	 * 以下是局部变量的代码。
	 */
	public String getName() 
	{
		int id = 0;//这个就是局部变量。
		return id + this.name;//此时“this.name”是用“this”关键字调用类成员变量中的“name”。
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
