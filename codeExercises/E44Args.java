class E44Args {
  public static void main(String[] args){
    for(String arg : args){
      System.out.println("Parametro: " + arg);
    }
    if ("dev".equals(args[0])){
      System.out.println("Inicializando programa en modo debug");
    }
  }
}
