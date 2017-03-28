package basics;

public class cons4 {
	int eid;
	String ename;
	float esal;
	cons4(){//user defined constructor//
		eid=2;
		ename="varun";
		esal=10.5f;
	}
	void m1(){
		System.out.println("eid value="+eid);
		System.out.println("ename value="+ename);
		System.out.println("esal value="+esal);
		
	}
	
public static void main(String[] args)
{
	cons4 c=new cons4();
	c.m1();
}
}
