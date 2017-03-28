package basics;

public class cons6 {
	cons6()
	{
		System.out.println("mon");
	}
	cons6(int a)
	{
		System.out.println("tue");
	}
	cons6(int a, float f)
	{
		System.out.println("wed");
	}
public static void main(String[] args)
{
	cons6 c=new cons6();
	cons6 c1=new cons6(10);
	cons6 c2=new cons6(10, 10.0f);
}
}
