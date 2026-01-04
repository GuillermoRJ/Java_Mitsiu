import java.time.LocalDate;

class U2E1 {
  public static void main(String[] args) {
    DiaDeMuertos mejorCelebracion = new DiaDeMuertos();

    mejorCelebracion.celebrar(
      "Me da mi calaverita",
      new String[] {"Flores", "Velas", "Tequila"}
    );
  }
}

class DiaFestivo {
  LocalDate fecha;

  void celebrar(){
    System.out.println("Comer dulces");
  }
}

class DiaDeMuertos extends DiaFestivo {
  void ponerAltar(String[] ofrendas){
    for (String ofrenda : ofrendas){
      System.out.println(ofrenda);
    }
  }

  void celebrar(String eslogan, String[] ofrendas){
    this.ponerAltar(ofrendas); // Invocar ponerAltar de DiaDeMuertos
    System.out.println(eslogan);
    super.celebrar();// Invocar celebrar de DiaFestivo
  }
}

