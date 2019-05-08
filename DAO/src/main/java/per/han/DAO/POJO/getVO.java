package per.han.DAO.POJO;

/**
 * 静态工厂获取对象
 */

public class getVO {
    private getVO(){}
    public static valueObj get(String name, long QQ, String direction, String date,
                               String graduated,
                               String reportLink,
                               String vow, String senior, String Channel) {
        valueObj obj = new valueObj();
        obj.setName(name);
        obj.setQQ(QQ);
        obj.setDirection(direction);
        obj.setDate(date);
        obj.setGraduated(graduated);
        obj.setReportLink(reportLink);
        obj.setVow(vow);
        obj.setSenior(senior);
        obj.setChannel(Channel);
        return obj;
    }
}
