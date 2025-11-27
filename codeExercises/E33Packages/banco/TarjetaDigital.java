package banco;

public class TarjetaDigital extends Tarjeta {
  int duracion;

  public TarjetaDigital(){
    super("1234 1234 1234 1234");
    this.duracion = 5;
  }
}
