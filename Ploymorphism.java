    
package basics;
class Ploymorphism{  
      void run(){
    	  System.out.println("running");
    	  }  

    class Splender extends Ploymorphism{
      void run(){
    	  System.out.println("running safely");
    	  }  
    }
      public static void main(String args[]){  
        Ploymorphism p = new Ploymorphism();//upcasting  
        p.run();  
      }  
      }