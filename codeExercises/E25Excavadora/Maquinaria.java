class Maquinaria {
  Maquinaria(){
    System.out.println("Creación sin parametros");
  }

  Maquinaria(String modelo, int anio){
    System.out.println("Creación con dos parametros");
  }

  Maquinaria(int anio, String loquesea){
    System.out.println("Creación con parametros inversos");
}

  void apagar() {
    System.out.println("Apagando");
  }
}

