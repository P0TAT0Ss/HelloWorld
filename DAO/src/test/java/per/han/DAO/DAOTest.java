package per.han.DAO;


import org.junit.Test;
import per.han.DAO.DAO.DAOFactory;
import per.han.DAO.DAO.DAOProxy;
import per.han.DAO.POJO.valueObj;

public class DAOTest {

    public static valueObj setObj(String name, long QQ, String direction, String date,
                                  String graduated, int id,
                                  String reportLink,
                                  String vow, String senior, String Channel) {

        valueObj obj = new valueObj();
        obj.setName(name);
        obj.setQQ(QQ);
        obj.setDirection(direction);
        obj.setDate(date);
        obj.setGraduated(graduated);
        obj.setId(id);
        obj.setReportLink(reportLink);
        obj.setVow(vow);
        obj.setSenior(senior);
        obj.setChannel(Channel);

        return obj;
    }

    @Test
    public void main(String[] args) {

        DAOProxy get = DAOFactory.getDAO();

        get.update(
                setObj("马爽", 450289570, "Web", "20190115",
                        "郑州大学", 7493,
                        "http://www.jnshu.com/school/32743/daily",
                        "努力学习！", "顾仁鹏", ""));
    }
}
