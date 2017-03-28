package basics;
class Emp{}
class A{}
public class t3 {
	Emp m1()
	{
		System.out.println("akhi");
		Emp e = new Emp();
		return e;
	}
	static A a()
	{
		System.out.println("mummy");
		A x= new A();
		return x;
		
	}
	
 public static void main(String[] args)
 {
	 t3 t= new t3();
	Emp e1= t.m1();
	System.out.println(e1);
	A y = t3.a();
	System.out.println(y);
 }
}
