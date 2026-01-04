class App {
  public static void main(String[] args) {
    Vocho vocho = new Vocho();
    vocho.litrosGasolina = 100;
    try{
      vocho.arrancar();
      vocho.acelerar(50);
    }catch (Exception ex){
      System.out.println(ex);
      System.out.println("Vocho cansado");
    }
  }
}

class Motor {
  public int caballosFuerza;

  Motor(int caballosFuerza) {
    this.caballosFuerza = caballosFuerza;
  }

  float acelerar(float gasolina) throws Exception{
    if (gasolina <= 0){
      throw new Exception("No se puede quitar gasolina del motor");
    }
    return gasolina * this.caballosFuerza;
  }
}

class Carro {
  public float velocidad;
  float litrosGasolina;
  private Motor motor = new Motor(150);

  protected void arrancar() throws Exception {
    if (this.litrosGasolina < 0.2){
      throw new Exception("Para arrancar se necesita gasolina");
    }
    this.litrosGasolina -= 0.2;
  }

  protected float acelerar(float gasolina) throws Exception {
    boolean runOut = false;
    if (this.litrosGasolina < gasolina) {
      gasolina = this.litrosGasolina;
      runOut = true;
    }
    this.velocidad = this.motor.acelerar(gasolina);
    this.litrosGasolina -= gasolina;
    if(runOut) {
      throw new Exception("Sin gasolina");
    }
    return this.velocidad;
  }
}

class Vocho extends Carro {
  public float velocidadMax;
  Vocho(){
    this.velocidadMax = 110;
  }
}
