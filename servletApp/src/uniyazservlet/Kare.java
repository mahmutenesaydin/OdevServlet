package uniyazservlet;

import java.util.ArrayList;

public class Kare extends Sekil
{
    double kenar1;

    public Kare(double kenar1)
    {
        this.kenar1 = kenar1;
    }

    @Override
    public String toString()
    {
        return "Kare{" +
                "kenar1=" + kenar1 +
                ", alan=" + alan +
                ", cevre=" + cevre +
                '}';
    }

    @Override
    public double alanHesapla()
    {
        alan = kenar1 * kenar1;
        return alan;
    }

    @Override
    public double cevreHesapla()
    {

        cevre = 2 * (kenar1 + kenar1);
        return cevre;
    }
}
