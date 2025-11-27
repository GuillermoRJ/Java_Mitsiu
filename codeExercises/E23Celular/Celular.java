import java.lang.Thread;

class Celular extends Electronico {
  int almacenamiento;
  int nivelCarga;

  Celular(int almacenamient, String model, int ani, int cantComponentes) {
    super();
    //super(model, ani, cantComponentes);
    this.nivelCarga = 80;
    this.almacenamiento = almacenamient;
  }

  int llamar(String dst) {
    try {

      int min = 1000;
      int max = 8000;
      int range = max - min + 1;
      int timeout = (int)(Math.random()  * range) + min;

      System.out.println("Llamando a " + dst);
      Thread.sleep(timeout);
      return timeout;
    } catch(Exception e){
      System.out.println(e);
      return 0;
    }
  }
}
