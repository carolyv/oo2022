import static org.junit.Assert.*;
import org.junit.*;

public class TemperatuurTest {
    Temperatuur tmp;
    Temperatuur tmp2;

    @Before
    public void algus() {
        tmp = new Temperatuur(25);
        tmp2 = new Temperatuur(-15);
    }
    // fahrenheidi katsetused
    @Test
    public void testFahrenheit() {
        assertEquals(77.0, tmp.teisendaFahrenheit(), 0);
    }
    @Test
    public void testFahrenheit2() {
        assertEquals(5.0, tmp2.teisendaFahrenheit(), 0);
    }
    // kelvini test
    @Test
    public void testKelvin() {
        assertEquals(298.15, tmp.teisendaKelvin(), 0);
    }
    @Test
    public void testKelvin2() {
        assertEquals(258.15, tmp2.teisendaKelvin(), 0);
    }
}
