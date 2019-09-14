package servlet;

import org.apache.ibatis.session.SqlSession;
import per.han.repository.Util.mybatisUtil;
import per.han.repository.VO.IFile;
import per.han.repository.mapper.fileMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SearchAll")
public class SearchAll extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String fileName = request.getParameter("searchAll");
        List<IFile> fileResults;
        SqlSession sqlsession = mybatisUtil.getSession();
        fileMapper mapper = sqlsession.getMapper(fileMapper.class);
        try {
            fileResults = mapper.queryByName(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
