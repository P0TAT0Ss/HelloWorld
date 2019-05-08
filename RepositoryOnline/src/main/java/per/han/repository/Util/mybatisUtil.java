package per.han.repository.Util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import per.han.repository.mapper.fileMapper;
import per.han.repository.mapper.userMapper;

import java.io.IOException;
import java.io.Reader;

public class mybatisUtil {
    private static final SqlSessionFactory factory;
    private static final String            resources = "mybatis-config.xml";
    private static       Reader            input;

    static {
        try {
            input = Resources.getResourceAsReader(resources);
        } catch (IOException e) {
        }
        factory = new SqlSessionFactoryBuilder().build(input);
        factory.getConfiguration().addMappers("per.han.repository.mapper");
        System.out.println("initial complete");
    }

    private static SqlSessionFactory getFactory() {
        return factory;
    }

    public static SqlSession getSession() {
        return getFactory().openSession();
    }
}
