package per.han.repository.mapper;

import org.apache.ibatis.annotations.*;
import per.han.repository.VO.User;

public interface userMapper {
    @Insert(value = "INSERT INTO users" +
            "(username, password, create_at) " +
            "VALUES" +
            "(#{username}, #{password}, now());")
    void insert(User user) throws Exception;

    @Delete(value = "DELETE FROM users " +
            "WHERE username = #{name};")
    void delete(String username) throws Exception;

    @Update(value = "UPDATE users " +
            "SET password = #{password} " +
            "WHERE username = #{username};")
    void update(User user) throws Exception;

    @Select(value = "SELECT password " +
            "FROM users " +
            "WHERE username = #{username};")
    String query(String username) throws Exception;
}
