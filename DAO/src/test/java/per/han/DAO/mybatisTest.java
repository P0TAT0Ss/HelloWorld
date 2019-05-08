package per.han.DAO;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import per.han.DAO.POJO.getVO;
import per.han.DAO.POJO.valueObj;
import per.han.DAO.myUtil.mybatisUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit DAOTest for simple App.
 */
public class mybatisTest {
    SqlSession session;

    @Test
    public void queryById() {
        session = mybatisUtil.getSession();
        valueObj student = session.selectOne("queryById", 7592);
        session.commit();
        System.out.println(student.getName());
        session.close();
    }

    @Test
    public void queryAll() {
        session = mybatisUtil.getSession();
        List<valueObj> objs = session.selectList("queryAll");
        session.commit();
        System.out.println(objs);
        session.close();
    }

    @Test
    public void fuzzyQuery() {
        session = mybatisUtil.getSession();
        valueObj obj = getVO.get("金", 0, null, null, null, null, null, "李", null);
        List<valueObj> objs = session.selectList("fuzzyQuery", obj);
        session.commit();
        System.out.println(objs.get(0).toString());
        session.close();
    }

    @Test
    public void insert() {
        session = mybatisUtil.getSession();
        valueObj obj = getVO.get("马爽", 450289570, "Web", "20190115",
                "郑州大学",
                "http://www.jnshu.com/school/32743/daily",
                "努力学习！", "顾仁鹏", "");
        session.insert("insertObj", obj);
        session.commit();
        session.close();
    }

    @Test
    public void batchInsert() {
        session = mybatisUtil.getSession();
        List<valueObj> objs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            objs.add(getVO.get("吴伟", 651934591, "Java", "20190430",
                    "38幼儿园",
                    "http://www.jnshu.com/school/351613/daily",
                    "给别人还花呗", "倪妃", "知乎"));
        }
        session.insert("test.batchInsert", objs);
        session.commit();
        session.close();
    }

    @Test
    public void delete() {
        session = mybatisUtil.getSession();
        session.delete("test.deleteById", 7493);
        session.commit();
        session.close();
    }

    @Test
    public void batchDeleteByName() {
        session = mybatisUtil.getSession();
        session.delete("batchDeleteByName", "金开");
        session.commit();
        session.close();
    }

    @Test
    public void updateVow() {
        session = mybatisUtil.getSession();

        valueObj obj = new valueObj();
        obj.setId(7592);
        obj.setVow("TestTestTest");
        session.update("test.updateById", obj);
        session.commit();
        session.close();
    }

    @Test
    public void batchUpdate() {
        session = mybatisUtil.getSession();
        List<valueObj> objs = new ArrayList<>();
        valueObj obj = new valueObj();
        obj.setId(65535);
        obj.setVow("打基础打基础");
        obj.setChannel("知乎");
        objs.add(obj);
        session.update("batchUpdate", objs);
        session.commit();
        session.close();
    }
}
