import java.math.*;

public class Variatsioon extends Permutatsioon {
    BigDecimal vastus;
    public BigDecimal leiaVariatsioon(int n, int k) {
        BigDecimal osa1 = new BigDecimal(leiaPerm(n));
        int lahutus = n - k;
        BigDecimal osa2 = new BigDecimal(leiaPerm(lahutus));
        vastus = osa1.divide(osa2, RoundingMode.UNNECESSARY);
        return vastus;
    }
}
