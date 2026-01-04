import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class U2E1Test {
  private final DiaFestivo diaFestivo = new DiaFestivo();
  private final diaDeMuertos diaMuertos = new diaDeMuertos();

  @Test
  void celebrarDiaFestivo() {
    assertEquals(true, diaFestivo.celebrar());
  }

  @Test
  void fallarPonerAltar() {
    assertFalse(diaMuertos.ponerAltar(new ArrayList<String>(), 0));
  }

  @Test
  void celebrarDiaMuertos() {
    assertTrue(diaMuertos.celebrar("ok", new ArrayList<String>(List.of("Tests", "Test", "Test"))));
  }
}
