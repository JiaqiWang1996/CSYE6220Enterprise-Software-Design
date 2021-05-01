import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

public class HW1_part4 extends HttpServlet{
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
                    response.setContentType("text/html");
                    PrintWriter out=response.getWriter();

        String acadamicterm= request.getParameter("acadamic_term");
        String acadamicyear = request.getParameter("acadamic_year");
        String employeestatus = request.getParameter("eStatus");

        String studentname = request.getParameter("Student_name");
        String studentNUID = request.getParameter("Student_NUID");
        String employeename = request.getParameter("Employee_name");
        String employeeNUID = request.getParameter("Employee_NUID");
String department = request.getParameter("Department");
String campuslocation = request.getParameter("Campus_location");
String phonenumber = request.getParameter("Phone_number");
String supervisorname= request.getParameter("Supervisor_name");

String schoolprogram= request.getParameter("school_program");
String coursenumber1= request.getParameter("Course_no1");
String coursename1= request.getParameter("Course_name1");
String supervisorsignature1= request.getParameter("Supervisor_signature 1");
String credithrs1= request.getParameter("Credit_hrs1");
String days1=request.getParameter("days1");
String time1=request.getParameter("time1");
String coursenumber2= request.getParameter("Course_no2");
String coursename2= request.getParameter("Course_name2");
String supervisorsignature2= request.getParameter("Supervisor_signature 2");
String credithrs2= request.getParameter("Credit_hrs2");
String days2=request.getParameter("days2");
String time2=request.getParameter("time2");
String coursenumber3= request.getParameter("Course_no3");
String coursename3= request.getParameter("Course_name3");
String supervisorsignature3= request.getParameter("Supervisor_signature 3");
String credithrs3= request.getParameter("Credit_hrs3");
String days3=request.getParameter("days3");
String time3=request.getParameter("time3");

String employeesignature=request.getParameter("Employee_signature");
String dateempolyee=request.getParameter("date_employee");

String hrmapproval=request.getParameter("HRM_approval");
String datehrm=request.getParameter("date_HRM");
               
        out.println("<html>");
        out.println("<head>");
        out.println("<title>enrollment form information Display</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<p> acadamic term is: " + acadamicterm + "</p>");
        out.println("<p> acadamic year  is: " + acadamicyear  + "</p>");
        out.println("<p> employee status is: " + employeestatus + "</p>");
   
        out.println("<p>student's name: " + studentname + "</p>");
        out.println("<p>student's NUID: " + studentNUID + "</p>");
        out.println("<p>employee's name : " + employeename  + "</p>");
        out.println("<p>employee's NUID: " +employeeNUID+ "</p>");
        out.println("<p>department is " + department + "</p>");
        out.println("<p>campus location is " + campuslocation + "</p>");
out.println("<p> phone number is " +  phonenumber + "</p>");
out.println("<p>supervisor's name is " +supervisorname + "</p>");

out.println("<p>school or program is " +schoolprogram + "</p>");
out.println("<p>No.1 course's number is " + coursenumber1+ "</p>");
out.println("<p>No.1 course's name is " +coursename1 + "</p>");
out.println("<p>No.1 supervisor's signature is " + supervisorsignature1+ "</p>");
out.println("<p>No.1 credit hours is " +credithrs1 + "</p>");
out.println("<p>No.1 day(s) is " +days1 + "</p>");
out.println("<p>No.1 time is " + time1+ "</p>");

out.println("<p>No.2 course's number is " + coursenumber2+ "</p>");
out.println("<p>No.2 course's name is " +coursename2 + "</p>");
out.println("<p>No.2 supervisor's signature is " + supervisorsignature2+ "</p>");
out.println("<p>No.2 credit hours is " +credithrs2+ "</p>");
out.println("<p>No.2 day(s) is " +days2+ "</p>");
out.println("<p>No.2 time is " + time2+ "</p>");

out.println("<p>No.3 course's number is " + coursenumber3+ "</p>");
out.println("<p>No.3 course's name is " +coursename3 + "</p>");
out.println("<p>No.3 supervisor's signature is " + supervisorsignature3+ "</p>");
out.println("<p>No.3 credit hours is " +credithrs3 + "</p>");
out.println("<p>No.3 day(s) is " +days3 + "</p>");
out.println("<p>No.3 time is " + time3+ "</p>");

out.println("<p>employee's signature is " +employeesignature + "</p>");
out.println("<p>Date of employee's signature is " + dateempolyee+ "</p>");

out.println("<p>HRM's approval is " +hrmapproval + "</p>");
out.println("<p>Date of HRM's signature is " + datehrm+ "</p>");





        out.println("</body>");
        out.println("</html>");
    }
}