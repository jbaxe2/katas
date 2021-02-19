import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTesterTest {
  @Test
  @DisplayName("Appropriate sides validate as a triangle.")
  public void testValidTriangles() {
    assertTrue (TriangleTester.isTriangle (1, 2, 2));
    assertTrue (TriangleTester.isTriangle (3, 4, 5));
  }

  @Test
  @DisplayName("Inappropriate sides do not conform to triangle criteria.")
  public void testInvalidTriangles() {
    assertFalse (TriangleTester.isTriangle (7, 2, 2));
    assertFalse (TriangleTester.isTriangle (0, 2, 2));
  }
}
