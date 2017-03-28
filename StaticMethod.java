
package basics;
public class StaticMethod {
	
	static class Student{  
	     int rollno;  
	     String name;  
	     static String college = "FDU";  
	       
	     static void change(){  
	     college = "JNTUH";  
	     }  
	  
	     Student(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	  
	     void display (){System.out.println(rollno+" "+name+" "+college);}  
	  
	    public static void main(String args[]){  
	    Student.change();  
	  
	    Student s1 = new Student (001,"DHAN");  
	    Student s2 = new Student (002,"FUNN");  
	    Student s3 = new Student (003,"MANN");  
	  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  
	}

}

