import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

public class HW1_part3 extends HttpServlet{
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
                    response.setContentType("text/html");
                    PrintWriter out=response.getWriter();

String Email = request.getParameter("email");
        String Password = request.getParameter("password");
        String Repassword = request.getParameter("repassword");
        String File = request.getParameter("file");
        String Gender = request.getParameter("inlineRadioOptions");
        String Country = request.getParameter("country");
        String[] Hobby = request.getParameterValues("hobby");
        String Address = request.getParameter("address");


               
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Personal Information Display</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<p>Your Email Address is: " + Email + "</p>");
        out.println("<p>Your Login Password is: " + Password + "</p>");
        out.println("<p>Your Repassword is: " + Repassword + "</p>");
        out.println("<p>Your Picture is: " + File + "</p>");
        out.println("<p>Your Gender is: " + Gender + "</p>");
        out.println("<p>Your Country is: " + Country + "</p>");
        out.println("<p>Your Hobbies are: " + "</p>");
        out.println("<ul>");
        for(String h: Hobby)
        {
            out.println("<li>" + h + "</li>");
        }
        out.println("</ul>");
        out.println("<p>Your Address is " + Address + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}