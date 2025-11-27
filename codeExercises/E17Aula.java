class E17Aula {
  public static void main(String[] args) {
    Alumno al1 = new Alumno("Juan", "UP110011");
    Alumno al2 = new Alumno("Alexis", "UP001100");

    Asiento as1 = new Asiento(false);
    as1.ocupante = al1;
    Asiento as2 = new Asiento(true);
    as2.ocupante = al2;

    Aula au604 = new Aula(2, "Aula 602");
    au604.asientos[0] = as1;
    au604.asientos[1] = as2;

    System.out.println(au604.entrar(al1));
    au604.mostrarOcupantes();
    System.out.println(au604.entrar(al2));
    au604.mostrarOcupantes();
    System.out.println(au604.salir(al2));
    au604.mostrarOcupantes();

  }
}

class Alumno {
  String nombre;
  String matricula;

  Alumno(String nombre, String matricula) {
    this.nombre = nombre;
    this.matricula = matricula;
  }
}

class Asiento {
  boolean diestro;
  Alumno ocupante;
  boolean ocupado;

  Asiento(boolean diestro) {
    this.diestro = diestro;
    this.ocupado = false;
  }
}

class Aula {
  String id;
  Asiento[] asientos;

  Aula (int numAsientos, String id) {
    this.asientos = new Asiento[numAsientos];
    this.id = id;
  }

  int entrar(Alumno alumno) {
    int asientosOcupados = 0;

    for (Asiento asiento : this.asientos) {
      if (asiento.ocupante == alumno) {
        asiento.ocupado = true;
      }

      if (asiento.ocupado) {
        asientosOcupados++;
      }
    }
    return asientosOcupados;
  }

  int salir(Alumno alumno) {
    int asientosOcupados = 0;

    for (Asiento asiento : this.asientos) {
      if (asiento.ocupante == alumno) {
        asiento.ocupado = false;
      }

      if (asiento.ocupado) {
        asientosOcupados++;
      }
    }
    return asientosOcupados;
  }

  void mostrarOcupantes() {
    for (Asiento asiento : this.asientos) {
      if (asiento.ocupado) {
        System.out.println(asiento.ocupante.nombre);
      }
    }
  }
}
