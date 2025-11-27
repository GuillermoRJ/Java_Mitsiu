import person.Estudiante;
import helpers.Email;

class App {
  public static void main(String[] args) {
    Estudiante es1 = new Estudiante();

    es1.setEmail("as@df");

    Email helperEmail = new Email();
    helperEmail.enviarEmail(es1.getEmail());
  }
}
