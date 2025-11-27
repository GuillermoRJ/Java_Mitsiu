import java.util.ArrayList;

class Cuarto {
  float altura;
  float ancho;
  float largo;

  ArrayList<Persona> personasDentro;

  Cuarto(float al, float an, float la) {
    this.altura = al;
    this.ancho = an;
    this.largo = la;

    this.personasDentro = new ArrayList<Persona>();
  }

  boolean entrar(Persona p) {
    boolean addResult = this.personasDentro.add(p);
    return addResult;
  }

  boolean salir(Persona p) {
    return this.personasDentro.remove(p);
  }
}
