package person;

public class Estudiante {
  String email;
  public String matricula;
  private int calif;

  public boolean setEmail(String email){
    if (!email.contains("@")) {
      return false;
    }
    this.email = email;
    return true;
  }
  public String getEmail() {
    return this.email;
  }
}
