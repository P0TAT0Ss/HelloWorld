package per.han.DB.mapper;

import org.apache.ibatis.annotations.Insert;
import per.han.DB.POJO.User;

public interface mapper {
    @Insert(value = "INSERT INTO" +
            " users(username,password,create_at)" +
            " VALUES(#{username},#{password},now());")
    void Insert(User user);
}
