package uniyazservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Servlet extends HttpServlet
{

    static Yazma yazma = new Yazma();
    static Okuma okuma = new Okuma();
    ArrayList<Object> sekilArrayList = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        sekilArrayList = okuma.okuma();
        double kenar1 = 0, kenar2 = 0, yaricap = 0, pi = 3.14, alan = 0, cevre = 0;

        String deger = req.getParameter("deger");
        String k = req.getParameter("kenar");
        kenar1 = Double.parseDouble(k);
        String k2 = req.getParameter("kenar2");
        kenar2 = Double.parseDouble(k2);
        String yc = req.getParameter("yaricap");
        yaricap = Double.parseDouble(yc);

        if ("Kare".equals(deger))
        {
            Kare kare = new Kare(kenar1);
            kare.alanHesapla();
            kare.cevreHesapla();

            String html =
                    "<html>" +
                            "<head></head>" +
                            "<body>" +
                                 "<h1>" + "Alan: " + kare.alan + "</h1>" +
                                 "<h1>" + "Çevre: " + kare.cevre+ "</h1>" +
                            "</body>" +
                            "</html>";
            sekilArrayList.add(kare);
            yazma.yazma(sekilArrayList);
            resp.getWriter().write(html);
        }
        else if ("Dikdortgen".equals(deger))
        {
            Dikdortgen dikdortgen = new Dikdortgen(kenar1, kenar2);
            dikdortgen.alanHesapla();
            dikdortgen.cevreHesapla();

            String html =
                    "<html>" +
                            "<head></head>" +
                            "<body>" +
                                 "<h1>" + "Alan: " + dikdortgen.alan + "</h1>" +
                                 "<h1>" + "Çevre: " + dikdortgen.cevre + "</h1>" +
                            "</body>" +
                            "</html>";
            sekilArrayList.add(dikdortgen);
            yazma.yazma(sekilArrayList);
            resp.getWriter().write(html);
        }
        else if ("Daire".equals(deger))
        {
            Daire daire = new Daire(kenar1, yaricap, pi);
            daire.alanHesapla();
            daire.cevreHesapla();

            String html =
                    "<html>" +
                            "<head></head>" +
                            "<body>" +
                                 "<h1>" + "Alan: " + daire.alan + "</h1>" +
                                 "<h1>" + "Çevre: " + daire.cevre + "</h1>" +
                            "</body>" +
                            "</html>";
            sekilArrayList.add(daire);
            yazma.yazma(sekilArrayList);
            resp.getWriter().write(html);
        }
    }
}