package basics;

public class cons7 {
	cons7()
	{
		this(10);
		System.out.println("mon");
	}
	cons7(int a)
	{
		this(10,10.0f);
		System.out.println("tue");
	}
	cons7(int a, float f)
	{
		System.out.println("wed");
	}
public static void main(String[] args)
{
	cons7 c=new cons7();
}
}
