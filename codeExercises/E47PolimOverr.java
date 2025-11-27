class E47PolimOverr {
  public static void main(String[] args) {
    Perro firulais = new Perro();
    firulais.hacerSonido();

    Animal a1 = new Animal();
    a1.hacerSonido();
  }
}

class Animal {
  void hacerSonido(){
    System.out.println("algo?");
  }
}

class Perro extends Animal {
  void hacerSonido(){
    System.out.println("whoooff");
  }
}
