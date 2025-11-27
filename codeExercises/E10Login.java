class E10Login {
  //int checkLogin(String);
  static int checkLogin(String reqEmail) {
    // Búsca reqEmail en emails
    String[] emails = new String[5];
    emails[0] = "martin@upa.edu.mx";
    emails[1] = "edgar@upa.edu.mx";
    emails[2] = "maria@upa.edu.mx";
    emails[3] = "marco@upa.edu.mx";
    emails[4] = "elena@upa.edu.mx";

    /*
    for (String email : emails) {
      if(email.equals(reqEmail)){
        // NO ME FUNCIONA PORQUE NECESITO EL INDEX
      }
    }
    */
    for (int indice = 0; indice < emails.length; indice++) {
      if(emails[indice].equals(reqEmail)){
        return indice;
      }
    }
    return -1;
  }
  //bool checkPassword(int, String);

  public static void main(String[] args) {
    System.out.print(checkLogin("asdf"));


  }
}
