package uniyazservlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class doGetList extends HttpServlet
{
    static Okuma okuma = new Okuma();
    ArrayList<Object> sekilArrayList = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        sekilArrayList= okuma.okuma();
        String html =
                "<html>" +
                        "<head></head>" +
                        "<body>" ;
        for (Object sekil : sekilArrayList)
        {
            html +="<h1>" + "Alan: " +  sekil.toString()+ "</h1>" ;
        }

        html+="</body>" +
                "</html>";
        resp.getWriter().write(html);
    }
}
