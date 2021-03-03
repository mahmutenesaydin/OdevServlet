package uniyazservlet;

import java.io.Serializable;

public abstract class Sekil implements Serializable
{
    public double alan;
    public double cevre;
    public abstract double alanHesapla();
    public abstract double cevreHesapla();
}
