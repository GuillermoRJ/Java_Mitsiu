package banco;

class Tarjeta {
  protected String numero;

  Tarjeta(String numero){
    this.numero = numero;
  }

  public String getTarjeta(){
    return this.numero.replaceAll("[^\s](?=.{4})", "*");
  }
}
