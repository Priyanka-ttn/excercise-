
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet
        (
                name = "Servlet",
                urlPatterns = {"/exercise"}
        )
public class FormRegistration extends HttpServlet {
    private String message;
    public void init() throws ServletException {
        message = "This is initialization method of servlet..";
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + message + "</h1>");
        String str = "<table border>";
        str += "<thead>";
        str += "<th>Email</th>";
        str += "<th>UserName</th>";
        str += "<th>Password</th>";
        str += "</thead>";
        str += "<tbody>";
        str += "<tr>";
        str += "<td>"+email+"</td>";
        str += "<td>"+username+"</td>";
        str += "<td>"+password+"</td>";
        str += "</tr>";
        str += "</tbody>";
        str += "</table>";


        out.write(str);
        out.flush();
    }
    public void destroy() {
        // Finalization code...
    }
}
