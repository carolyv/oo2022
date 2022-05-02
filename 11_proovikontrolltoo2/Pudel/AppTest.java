import static org.junit.Assert.*;
import org.junit.*;

public class AppTest {
    Jook vesi = new Jook("vesi", 0.9, 1);
    Joogivaat vaat = new Joogivaat(10, 5, null);
    Joogipudel pudel1 = new Joogipudel(1, 0.3, 0.1, "Plastmass", vesi);
    Joogipudel pudel2 = new Joogipudel(0.8, 0.2, 0.25, "Plastmass", null);
    // 1) automaattestid
    @Test
    public void omahinnaTest() {
        // kui jook null, siis hind on võrdne taara hinnaga
        assertEquals(0.2, pudel2.leiaOmahind(), 0.1);
    }
    @Test
    public void omahinnaTest2() {
        assertEquals(1.0, pudel1.leiaOmahind(), 0.1);
    }
    @Test
    public void massiTest() {
        // kui jook puudub, siis mass on võrdne pudeli massiga
        assertEquals(0.2, pudel2.leiaMass(), 0.1);
    }
    @Test
    public void massiTest2() {
        // kui jook puudub, siis mass on võrdne pudeli massiga
        assertEquals(1.3, pudel1.leiaMass(), 0.1);
    }
    // 2) automaattestid
}
