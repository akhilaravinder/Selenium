package basics;

public class cons5 {
	int eid;
	String ename;
	float esal;
	//parameterized constructor//
	cons5(int eid,String ename,float esal){
		//conversion of local values to instance values//
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	void m1(){
		System.out.println("eid value="+eid);
		System.out.println("ename value="+ename);
		System.out.println("esal value="+esal);
		
	}
	
public static void main(String[] args)
{
	cons5 c=new cons5(1,"a",1000);
	cons5 c1=new cons5(2,"v",20000);
	c1.m1();
	c.m1();
}
}
