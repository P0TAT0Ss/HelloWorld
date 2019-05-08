package servlet;

import org.apache.ibatis.session.SqlSession;
import per.han.repository.Util.mybatisUtil;
import per.han.repository.VO.User;
import per.han.repository.mapper.userMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "signUp")
public class signUp extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();

        String title;
        final String doctype = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<meta charset=\"UTF-8\">\n";
        try (SqlSession session = mybatisUtil.getSession()) {

            String inputUsername = request.getParameter("username");
            String inputPassword = request.getParameter("password");

            userMapper usermapper = session.getMapper(userMapper.class);
            User user = new User.builder(inputUsername, inputPassword).build();
            usermapper.insert(user);

            title = "Congratulations!";
            writer.println(doctype + "<head><title>" + title + "</title></head>");
            writer.println("<body><h1 align = \"center\">Enjoy your \"memory\" trial!</h1></body></html>");

            session.commit();

            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("username", inputUsername);

            response.setHeader("refresh", "1;url=/RepositoryOnline_war_exploded/iRepository");
        } catch (Exception e) {
            title = "Fail!";
            writer.println(doctype + "<head><title>" + title + "</title></head>");
            writer.println("<body><h1 align = \"center\">username is already exist</h1></body></html>");
            response.setHeader("refresh", "1;url=/RepositoryOnline_war_exploded/signUp.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

    }
}
