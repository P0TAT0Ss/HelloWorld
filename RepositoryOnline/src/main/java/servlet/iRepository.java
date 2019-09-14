package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "iRepository")
public class iRepository extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        String sessionUsername = (String)httpSession.getAttribute("username");

        try {
            if (!sessionUsername.isEmpty())
            response.sendRedirect("/RepositoryOnline_war_exploded/iRepository.html");
        } catch (NullPointerException e){
            response.sendRedirect("/RepositoryOnline_war_exploded/signIn.html");
        }
    }
}
