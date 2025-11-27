class Animal {
  int energia;
  int saciedad;
  String especie;
  String raza;
  float tamanio;
  float peso;

  int comer(
    String tipoAlimento,
    float cantidad
  ) {
    this.saciedad = (int)cantidad;
    return this.saciedad;
  }

  int descansar(int tiempo) {
    this.energia = tiempo;
    return this.energia;
  }
}
