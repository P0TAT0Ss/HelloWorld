package per.han.DAO.DAO;

import org.apache.ibatis.annotations.Insert;
import per.han.DAO.POJO.valueObj;

import java.util.List;

public interface DAO {
    @Insert(value = "")
    void insert(valueObj obj);

    void delete(int id);

    void update(valueObj obj);

    valueObj query(int id);

    valueObj query(String name);

    List<valueObj> queryAll();
}
