class Bicycle {
  double wheel_diam; // diameter of the bicycle wheels (in inches)
  double multiplier; // gear multiplier
  double distance;   // total distance traveled (in miles)
  int cadence;       // current pedaling cadence (in rotations/min)
  int gear;          // current gearing
  
  public Bicycle(double diam, double mul) {
    wheel_diam = diam;
    multiplier = mul;
    distance = 0.0;
    cadence  = 0;
    gear     = 1;
  }

  void changeCadence(int val) {
    cadence = val;
  }

  void gearDown() {
    gear = gear - 1;
  }

  void gearUp() {
    gear = gear + 1;
  }
  
  void pedal(int minutes) {
    // your code goes here!
  }
  
  void printState() {
    System.out.format("Distance traveled: %.2f miles\n", distance);
  }

  public static void main (String[] args) {
    Bicycle bike = new Bicycle(29.0, 1.25);
    bike.printState();
  }
}