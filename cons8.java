package basics;

public class cons8 {
	cons8()
	{
		System.out.println("minnu");
	}
	cons8(int a)
	{
		
		System.out.println("akhi");
	}
	cons8(int a, float f)
	{
		System.out.println("both");
	}
public static void main(String[] args)
{
	//named approach
	cons8 c=new cons8();
	cons8 c1=new cons8(10);
	cons8 c2=new cons8(10,20.0f);
	//nameless approach
	new cons8();
	new cons8(10);
	new cons8(10,20.0f);
}
}
