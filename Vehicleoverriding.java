package basics;
class VehicleOverriding {
    public void move () {
         System.out.println ("Vehicles are used for moving from one place to another ");
    }
}

class Car extends VehicleOverriding {
    public void move () {
      super. move (); // invokes the super class method
      System.out.println ("Car is a good medium of transport ");
    }
    
}