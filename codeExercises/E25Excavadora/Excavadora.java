class Excavadora extends Maquinaria{
  void bajarCuchara(int mts) {
    System.out.println("La cuchara bajó a " + mts);
  }

  void apagar(){
    System.out.println("Apagando excavadora");
    this.bajarCuchara(0);
    super.apagar();
  }
}
