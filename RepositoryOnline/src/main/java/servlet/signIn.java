package servlet;

import org.apache.ibatis.session.SqlSession;
import per.han.repository.Util.mybatisUtil;
import per.han.repository.mapper.userMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "signIn")
public class signIn extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String title;
        String doctype = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<meta charset=\"UTF-8\">\n";
        try (SqlSession session = mybatisUtil.getSession()) {

            String inputUsername = request.getParameter("username");
            String inputPassword = request.getParameter("password");

            userMapper usermapper = session.getMapper
                    (per.han.repository.mapper.userMapper.class);

            String password = usermapper.query(inputUsername);

            session.commit();

            if (password.equals(inputPassword)) {
                HttpSession httpSession = request.getSession();
                httpSession.setAttribute("username", inputUsername);
                response.sendRedirect("/RepositoryOnline_war_exploded/iRepository");

            } else {
                title = "Fail!";
                writer.println(doctype + "<head><title>" + title + "</title></head>");
                writer.println("<body><h1 align = \"center\">WRONG PASSWORD!</h1></body></html>");
                response.setHeader("refresh", "0.5;url=/RepositoryOnline_war_exploded/signIn.html");

            }
        } catch (NullPointerException e) {
            title = "Fail!";
            response.setHeader("refresh", "1;url=/RepositoryOnline_war_exploded/signIn.html");
            writer.println(doctype + "<head><title>" + title + "</title></head>");
            writer.println("<body><h1 align = \"center\">USER IS NOT EXIST!</h1></body></html>");

        } catch (Exception e) {
            title = "Exception";
            response.setHeader("refresh", "10;url=/RepositoryOnline_war_exploded/signIn.html");
            writer.println(doctype + "<head><title>" + title + "</title></head>");
            writer.println("<body><h1 align = \"center\">" + e.getMessage() + "</h1></body></html>");
            e.printStackTrace();
        }
    }
}
