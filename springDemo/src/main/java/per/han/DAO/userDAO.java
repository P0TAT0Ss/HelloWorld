package per.han.DAO;


import org.springframework.stereotype.Repository;
import per.han.Entity.userEntity;

@Repository
public interface userDAO {
    int insert(userEntity userEntity);
    void query(String username);
    int delete(String username);
    void update(String username);
}
