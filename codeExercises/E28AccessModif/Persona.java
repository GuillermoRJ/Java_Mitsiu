class Persona {
  public String nombre;
  protected String telefono;

  // SETTER (escribir valor)
  boolean setTelef(String newTelef) {
    // Validar 10 numeros
    if (newTelef.length() != 10) {
      System.out.println("Debe tener 10 digitos");
      return false;
    }
    // Validar solo numeros
    if (!newTelef.matches("\\d+")){
      System.out.println("Debe contener solo digitos");
      return false;
    }
    this.telefono = newTelef;
    return true;
  }

  // GETTER (leer)
  String getTelef(){
    return this.telefono;
  }
}
