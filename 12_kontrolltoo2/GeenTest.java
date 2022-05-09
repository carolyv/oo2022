import static org.junit.Assert.assertEquals;
import org.junit.*;

public class GeenTest {
    Alleel a1, a2, a3, a4, a5;
    Geen g1;

    @Before
    public void algus() {
        a1 = new Alleel("Retsessiivne", true);
        a2 = new Alleel("Retsessiivne", false);
        a3 = new Alleel("Dominantne", false);
        a4 = new Alleel("Dominantne", false);
        a5 = new Alleel("Retsessiivne", false);
    }

    @Test
    public void posGeen() throws Exception {
        Geen g1 = new Geen(a1, a2);
        assertEquals("Positiivne", g1.geeniVaartus());
    }
    @Test
    public void negGeen() throws Exception {
        Geen g2 = new Geen(a2, a5);
        assertEquals("Negatiivne", g2.geeniVaartus());
    }
}
