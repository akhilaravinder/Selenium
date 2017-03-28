package basics;

public class ins5 {
int e;
{//instance blocks intializing variables during object creation
	e=10;
}
void m1()
{
	System.out.println(e);
}
public static void main(String[] args)
{
	ins5 n=new ins5();
	n.m1();
}
}
