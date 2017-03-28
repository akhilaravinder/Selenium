package basics;

public class ins4 {
	ins4()
	{
		this(10);
		System.out.println("mon");
	}
	ins4(int a)
	{
		System.out.println("tue");
	}
	
	{
		System.out.println("wed");
	}
	
	public static void main(String[] args)
	{
		ins4 n=new ins4();
		//ins4 n1=new ins4(10);
	}
}
