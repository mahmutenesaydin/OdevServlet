package uniyazservlet;

import java.io.Serializable;
import java.util.ArrayList;

public class Daire extends Sekil
{
     double kenar;
     double yaricap;
     double pi = 3.14;

    public Daire(double kenar, double yaricap, double pi)
    {
        this.kenar = kenar;
        this.yaricap = yaricap;
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "kenar=" + kenar +
                ", yaricap=" + yaricap +
                ", pi=" + pi +
                ", alan=" + alan +
                ", cevre=" + cevre +
                '}';
    }

    @Override
    public double alanHesapla() {
        alan = (double) (pi * yaricap * yaricap);
        return alan;

    }

    @Override
    public double cevreHesapla() {
        cevre = (int) (2 * pi * yaricap);
        return cevre;
    }
}
