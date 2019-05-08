package per.han.DAO.DAO;

import per.han.DAO.POJO.valueObj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOImpl implements DAO {
    private valueObj obj;
    private List<valueObj> objs;
    private Connection connect;

    public DAOImpl(Connection connection) {
        connect = connection;
        objs = new ArrayList<>();
    }

    @Override
    public void insert(valueObj obj) {
        String sql = "INSERT INTO students" +
                "(name, QQ, direction, date, graduated, id, reportLink, vow, senior, channel, create_at)" +
                "VALUES (?,?,?,?,?,?,?,?,?,?,now());";
        try (PreparedStatement pState = connect.prepareStatement(sql)) {
            pState.setString(1, obj.getName());
            pState.setLong(2, obj.getQQ());
            pState.setString(3, obj.getDirection());
            pState.setString(4, obj.getDate());
            pState.setString(5, obj.getGraduated());
            pState.setInt(6, obj.getId());
            pState.setString(7, obj.getReportLink());
            pState.setString(8, obj.getVow());
            pState.setString(9, obj.getSenior());
            pState.setString(10, obj.getChannel());
            pState.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM students where id = ?;";
        try (PreparedStatement pState = connect.prepareStatement(sql)) {
            pState.setInt(1, id);
            pState.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(valueObj obj) {
        String sql = "update students set name = ?, QQ = ?, direction = ?, " +
                "date = ?,graduated = ?, reportLink = ?, vow = ?,senior = ?,channel = ? where id = ?;";
        try (PreparedStatement pState = connect.prepareStatement(sql)) {
            pState.setString(1, obj.getName());
            pState.setLong(2, obj.getQQ());
            pState.setString(3, obj.getDirection());
            pState.setString(4, obj.getDate());
            pState.setString(5, obj.getGraduated());
            pState.setString(6, obj.getReportLink());
            pState.setString(7, obj.getVow());
            pState.setString(8, obj.getSenior());
            pState.setString(9, obj.getChannel());
            pState.setInt(10, obj.getId());
            pState.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public valueObj query(int id) {
        obj = new valueObj();
        String sql = "select*from students where id = ?;";
        try (
                PreparedStatement pState = connect.prepareStatement(sql)
        ) {
            pState.setInt(1, id);
            ResultSet result = pState.executeQuery();
            if (result.next()) {
                obj.setName(result.getString(1));
                obj.setQQ(result.getLong(2));
                obj.setDirection(result.getString(3));
                obj.setDate(result.getString(4));
                obj.setGraduated(result.getString(5));
                obj.setId(id);
                obj.setReportLink(result.getString(7));
                obj.setVow(result.getString(8));
                obj.setSenior(result.getString(9));
                obj.setChannel(result.getString(10));
                obj.setCreate_at(result.getString(11));
                obj.setUpdate_at(result.getString(12));
            } else {
                System.out.println("Not exist!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public valueObj query(String name) {
        obj = new valueObj();
        String sql = "select*from students where name = ?;";
        try (
                PreparedStatement pState = connect.prepareStatement(sql)
        ) {
            pState.setString(1, name);
            ResultSet result = pState.executeQuery();
            if (result.next()) {
                obj.setName(name);
                obj.setQQ(result.getLong(2));
                obj.setDirection(result.getString(3));
                obj.setDate(result.getString(4));
                obj.setGraduated(result.getString(5));
                obj.setId(result.getInt(6));
                obj.setReportLink(result.getString(7));
                obj.setVow(result.getString(8));
                obj.setSenior(result.getString(9));
                obj.setChannel(result.getString(10));
                obj.setCreate_at(result.getString(11));
                obj.setUpdate_at(result.getString(12));
            } else {
                System.out.println("Not exist!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public List<valueObj> queryAll() {
        String sql = "select*from students ;";
        try (PreparedStatement pState = connect.prepareStatement(sql)) {
            ResultSet result = pState.executeQuery();
            while (result.next()) {
                obj = new valueObj();
                obj.setName(result.getString(1));
                obj.setQQ(result.getLong(2));
                obj.setDirection(result.getString(3));
                obj.setDate(result.getString(4));
                obj.setGraduated(result.getString(5));
                obj.setId(result.getInt(6));
                obj.setReportLink(result.getString(7));
                obj.setVow(result.getString(8));
                obj.setSenior(result.getString(9));
                obj.setChannel(result.getString(10));
                obj.setCreate_at(result.getString(11));
                obj.setUpdate_at(result.getString(12));
                objs.add(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return objs;
    }
}
