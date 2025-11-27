class App {
  public static void main(String[] args) {
    Drone d1 = new Drone();
    Drone d2 = new Drone();
    Drone d3 = new Drone();

    d1.lat = 10f;
    d1.lon = 10f;
    d1.alt = 10f;

    d2.lat = -10f;
    d2.lon = -10f;
    d2.alt = 10f;

    d3.lat = 0f;
    d3.lon = 0f;
    d3.alt = 10f;

    //d1.returnToBase = true;
    Drone.returnToBase = true;
    Drone.setMode("Show");
  }
}

class Drone {
  static boolean returnToBase;
  static String mode;

  float lat;
  float lon;
  float alt;

  void FlightToOrigin(){
    this.lat = 0f;
    this.lon = 0f;
    this.alt = 0f;
  }

  static void setMode(String newmode){
    mode = newmode;
  }
}
