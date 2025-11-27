class E14UsuarioConstruc {
  public static void main(String[] args) {
    User pablito = new User("pav@gmail.com", "pabli", (short)25);
    //User pablito = new User();
  }
}

class User {
  String nombre;
  String correo;
  short edad;

  User(String paramCorreo, String paramNombre, short paramEdad) {
    this.correo = paramCorreo;
    this.nombre = paramNombre;
    this.edad = paramEdad;
  }
}
