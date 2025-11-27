class E26Windows {
  public static void main(String[] args) {

  }
}

class Windows {
  // Polimorfismo

  // Function Signature: iniciarAplicacion(Icono)
  void iniciarAplicacion(Icono icono){
    System.out.println(icono.nombreApp);
  }

  // Function Signature: iniciarAplicacion(ResultadoBuscador)
  void iniciarAplicacion(ResultadoBuscador resBusc) {
    System.out.println(resBusc.ruta);
  }

  // Function Signature: iniciarAplicacion(CmdPath)
  void iniciarAplicacion(CmdPath cmdPath){
    System.out.println(cmdPath);
  }
}
