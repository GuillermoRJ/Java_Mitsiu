class E45Contador {
  public static void main(String[] args) {
    Contador c = new Contador();
    //c.numero;
    System.out.println(c.getNum());
    c.increm();
    System.out.println(c.getNum());
  }
}

class Contador {
  private int numero;

  public int getNum(){
    return this.numero;
  }
  /*
  public void setNum(int n){
    if(this.numero +1 == n) {
      this.numero = n;
    }
  }
  */
  public void increm(){
    this.numero += 1;
  }
}
