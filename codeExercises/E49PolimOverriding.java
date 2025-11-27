class E49PolimOverriding {
  public static void main(String[] args) {
    Mamifero m = new Mamifero();
    m.caminar();

    Animal a = new Animal();
    a.caminar();
  }
}

class Animal{
  void caminar(){
    System.out.println("Caminar como animal");
  }
}

class Mamifero extends Animal {
  void caminar(){
    System.out.println("Caminar como mamifero");
  }
}
