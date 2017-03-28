package basics;

class MultilevelInheritance
{
   public void methodMultilevelInheritance()
   {
     System.out.println("Class XMultilevelInheritance method");
   }

public static class Y extends MultilevelInheritance
{
public void methodY()
{
System.out.println("class Y method");
}

public static class Z extends Y
{
   public void methodZ()
   {
     System.out.println("class Z method");
   }
   public static void main(String args[])
   {
     Z obj = new Z();
     obj.methodMultilevelInheritance(); //calling grand parent class method
     obj.methodY(); //calling parent class method
     obj.methodZ(); //calling local method
  }
}
}
}