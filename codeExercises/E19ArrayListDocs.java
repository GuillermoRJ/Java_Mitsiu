import java.util.ArrayList;

class E19ArrayListDocs {
  public static void main(String[] args) {
    ArrayList<String> nombre = new ArrayList<String>();
    nombre.add(0, "Sarabia");
    nombre.add(0, "Carreño");
    nombre.add(0, "Alejandro");
    nombre.add(0, "Mitsiu");

    System.out.println(nombre);

    if (nombre.contains("mitsiu")){
      System.out.println("Existe");
    }else {
      System.out.println("No existe");
    }

    System.out.println(nombre.indexOf("Mitsiu"));
    System.out.println(nombre.indexOf("mitsiu"));
    //nombre.forEach(e -> System.out.println(e));

    nombre.sort(null);

    nombre.replaceAll(e -> e.toUpperCase());

    //System.out.println(nombre.hashCode());
    //System.out.println(nombre.hashCode());
    nombre.set(0, nombre.get(0).toLowerCase());
    System.out.println(nombre);
  }
}
