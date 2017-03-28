package basics;

public class cons2 {
	void m1()
	{
		System.out.println("varun");
	}
cons2()
{
	System.out.println("xyz");
}
cons2(int a)
{
	System.out.println("abc");
}
public static void main(String[] args)
{
	cons2 c=new cons2();
	cons2 c1=new cons2(10);
	c.m1();
	c1.m1();
}
}
