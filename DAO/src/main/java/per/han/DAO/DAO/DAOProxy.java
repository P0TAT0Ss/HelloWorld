package per.han.DAO.DAO;

/**
 * 代理实现类，封装具体实现。
 */

import per.han.DAO.POJO.valueObj;

import java.sql.Connection;
import java.util.List;


public class DAOProxy implements DAO {


    private Connection connection;
    private DAOImpl impl;

    public DAOProxy() {
        this.connection = new db_Connect().getConnect();
        this.impl = new DAOImpl(connection);
    }

    @Override
    public void insert(valueObj obj) {
        impl.insert(obj);
    }

    @Override
    public void delete(int id) {
        impl.delete(id);
    }

    @Override
    public void update(valueObj obj) {
        impl.update(obj);
    }

    @Override
    public valueObj query(int id) {
        return impl.query(id);
    }

    @Override
    public valueObj query(String name) {
        return impl.query(name);
    }

    @Override
    public List<valueObj> queryAll() {
        return impl.queryAll();
    }
}
