import java.util.ArrayList;

class Cocina extends Cuarto {
  ArrayList<String> muebles;

  Cocina () {
    super(12f, 3f, 5f);
    this.muebles = new ArrayList<String>();
  }
}
