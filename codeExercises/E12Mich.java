class E12Mich {
  public static void main(String[] args){
    Sucursal mich1 = new Sucursal();
    mich1.employees = new String[3];

    mich1.employees[0] ="Paco";
    mich1.employees[1] = "Ana";
    mich1.location = "Aguascalientes";
    mich1.workingHours = "10-8";

    System.out.println("Ubicación: " + mich1.location);
    System.out.println("Horario: " + mich1.workingHours);

    int numEmpleado = 1;
    for (String empleado : mich1.employees) {
      System.out.print("Empleado " + numEmpleado + ": " + empleado + "\n");
      ++numEmpleado;
    }
    //Sucursal[] proprietarioCarreno = new Sucursal[2];
  }
}

class Sucursal {
  String location;
  String workingHours;
  String[] employees;
}
