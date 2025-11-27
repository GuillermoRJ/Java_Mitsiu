class Persona {
  private String numeroTarjeta;

  Persona(String nom){
    this.numeroTarjeta = nom;
  }
  // Lectura de numeroTarjeta
  String getNumeroTarjeta(){
    String masked = this.numeroTarjeta.replaceAll("[^-](?=.{4})", "*");
    return masked;
  }

  void setNumeroTarjeta(String nuevoNumeroTarjeta){
    this.numeroTarjeta = nuevoNumeroTarjeta;
  }
}

// Castro de luna
