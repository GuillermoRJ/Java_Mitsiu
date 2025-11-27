class App {
  public static void main(String[] args) {
    Persona per1 = new Persona();
    if (per1.setTelef("0123456789")){
      System.out.println("Telefono actualizado");
    } else {
      System.out.println("Error al actualizar el telefono");
    }

    System.out.println(per1.getTelef());

    // ====================
    Estudiante es1 = new Estudiante();
    es1.matricula = "UP111111";
    es1.nombre = "Juanito";
    es1.setTelef("1234567890");

    es1.printNombre();
    es1.printTelef();
  }
}
