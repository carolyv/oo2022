import java.math.BigInteger;

public class Permutatsioon {
    BigInteger vastus = BigInteger.ONE;
    BigInteger tagastus;
    public BigInteger leiaPerm(int arv) {
        for(int i = 1; i <= arv; i++) {
            vastus = vastus.multiply(BigInteger.valueOf(i));
        }
        tagastus = vastus;
        vastus = BigInteger.ONE;
        return tagastus;
    }
}
