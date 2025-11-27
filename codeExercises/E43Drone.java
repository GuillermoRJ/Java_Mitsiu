class E43Drone{
  public void main(String[] args) {
    Dron d1 = new Dron(10f, 10f, 10f);
    Dron d2 = new Dron(5f, 5f, 10f);
    Dron d3 = new Dron(-10f, -10f, 10f);
    Dron d4 = new Dron(-5f, -5f, 10f);
    Dron d5 = new Dron(0f, 0f, 15f);

    System.out.println(d1.regresarABase);
    System.out.println(d2.regresarABase);
    System.out.println(d3.regresarABase);
    System.out.println(d4.regresarABase);
    System.out.println(d5.regresarABase);

    Dron.regresarABase = true;
    System.out.println(d1.regresarABase);
    System.out.println(d2.regresarABase);
    System.out.println(d3.regresarABase);
    System.out.println(d4.regresarABase);
    System.out.println(d5.regresarABase);

    System.out.println();
    System.out.println();
    Dron.printRegresarABase();
    d1.printLat();
  }
}

class Dron{
  static boolean regresarABase;
  float lat;
  float lon;
  float alt;

  Dron(float lat, float lon, float alt) {
    this.lat = lat;
    this.lon = lon;
    this.alt = alt;
  }

  static void printRegresarABase() {
    System.out.println(regresarABase);
  }

  void printLat(){
    System.out.println(regresarABase);
  }
}
