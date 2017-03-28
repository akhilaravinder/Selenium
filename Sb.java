package basics;

public class Sb {
	{
		System.out.println("mon");
	}
	{
		System.out.println("tue");
	}
	static
	{
		System.out.println("wed");
	}
	static
	{
		System.out.println("thurs");
	}
	{
		System.out.println("fri");
	}
Sb()
{
	this(10);
	System.out.println("sat");
}
Sb(int a){
	System.out.println("x");
}
public static void main(String[] args)
{
	new Sb();
new Sb(10);
}
}
