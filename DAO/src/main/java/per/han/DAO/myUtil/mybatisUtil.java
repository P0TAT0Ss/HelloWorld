package per.han.DAO.myUtil;
/**
 * 单例模式
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class mybatisUtil {
    private final static SqlSessionFactory factory;

    static  {
        InputStream input = null;
        String resource = "mybatis-config.xml";
        try {
            input = Resources.getResourceAsStream(resource);

        } catch (IOException e) {
            e.printStackTrace();
        }
        factory = new SqlSessionFactoryBuilder().build(input);
    }

    //  Get a factory
    public static SqlSessionFactory getFactory() {
        return factory;
    }

    //  Get SQL session
    public static SqlSession getSession() {
        return getFactory().openSession();
    }

    //  Close SQL session
    public static void close(SqlSession session) {
        if (session != null) {
            session.close();
        }
    }
}
