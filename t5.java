package basics;

public class t5 {
	int a=10;
	int m1(int a)
	{
		System.out.println("akhi");
		return this.a;
	}
	
public static void main(String[] args)
{
	t5 x=new t5();
	int y=x.m1(200);
	System.out.println("akhi return value="+y);
	
}
}
