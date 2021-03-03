package uniyazservlet;

import java.util.ArrayList;

public class Dikdortgen extends Sekil {
    double kenar1;
    double kenar2;

    public Dikdortgen(double kenar1, double kenar2) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "kenar1=" + kenar1 +
                ", kenar2=" + kenar2 +
                ", alan=" + alan +
                ", cevre=" + cevre +
                '}';
    }

    @Override
    public double alanHesapla() {
        alan = kenar1 * kenar2;
        return alan;
    }

    @Override
    public double cevreHesapla() {
        cevre = 2 * (kenar1 + kenar2);
        return cevre;
    }
}
