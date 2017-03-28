package basics;

public class t2 {
	int m1()
	{
		System.out.println("hello world");
		return 10;
	}
	int m2()
	{
		System.out.println("akhi");
		return 20;
	}
	static int m3()
	{
		System.out.println("varun");
		return 30;
	}
public static void main(String[] args){
	 t2 t= new t2();
	int x = t.m1();
	System.out.println("return value of m1()="+x);
	int y= t.m2();
System.out.println("return value of m2()="+y);
int z = t2.m3();
System.out.println("return value of m3()="+z);
}
}