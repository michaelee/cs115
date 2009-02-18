class Bicycle {
  int cadence = 0;
  int speed = 0;
  int gear = 1;

  void changeCadence(int val) {
    cadence = val;
  }

  void gearDown() {
    gear = gear - 1;
  }

  void gearUp() {
    gear = gear + 1;
  }

  void speedUp(int increment) {
    speed = speed + increment;   
  }

  void applyBrakes(int decrement) {
    speed = speed - decrement;
  }
  
  void printState() {
    System.out.format("Cadence: %d, Speed: %d, Gear: %d\n", cadence, speed, gear);
  }

  public static void main (String[] args) {
    Bicycle bike = new Bicycle();
    bike.printState();
  }
}