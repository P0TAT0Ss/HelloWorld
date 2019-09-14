package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "signOut")
public class signOut extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        response.setContentType("text/html");
        request.getSession().removeAttribute("username");
        response.sendRedirect("http://localhost:8080/RepositoryOnline_war_exploded/iRepository");
    }
}
