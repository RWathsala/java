public class Bikes {

    int speed = 40;
    int gear = 4;
    String made = "FZ";
  
    static void changeGear() {
      System.out.println("You can change Gear");
    }
  
    static void speedUp() {
      System.out.println("You can change Speed");
    }
  
    static void applyBrake() {
      System.out.println("You can Apply Brake");
    }
  
    static void printStatus() {
      System.out.println("Status is FZ");
    }
  
    public static void main(String[] args) {
  
      Bikes b1 = new Bikes();
  
      System.out.println("Speed is : " + b1.speed + "km");
      System.out.println("It has : " + b1.gear + " gears");
      System.out.println("Mode is : " + b1.made);
      System.out.println("");
      changeGear();
      speedUp();
      applyBrake();
      printStatus();
  
    }
  
  }