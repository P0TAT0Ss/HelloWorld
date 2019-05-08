package per.han.DAO.POJO;


public class valueObj {

    private String name;
    private long QQ;
    private String direction;
    private String date;
    private String graduated;
    private int id;
    private String reportLink;
    private String vow;
    private String senior;
    private String channel;
    private String Create_at;
    private String Update_at;

    public void setCreate_at(String create_at) {
        Create_at = create_at;
    }

    public void setUpdate_at(String update_at) {
        Update_at = update_at;
    }

    public String getCreate_at() {
        return Create_at;
    }

    public String getUpdate_at() {
        return Update_at;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQQ() {
        return QQ;
    }

    public void setQQ(long QQ) {
        this.QQ = QQ;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGraduated() {
        return graduated;
    }

    public void setGraduated(String graduated) {
        this.graduated = graduated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReportLink() {
        return reportLink;
    }

    public void setReportLink(String reportLink) {
        this.reportLink = reportLink;
    }

    public String getVow() {
        return vow;
    }

    public void setVow(String vow) {
        this.vow = vow;
    }

    public String getSenior() {
        return senior;
    }

    public void setSenior(String senior) {
        this.senior = senior;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }


    @Override
    public String toString() {
        return getName()+getSenior()+getDirection()+getGraduated()+getReportLink()+getCreate_at();
    }
}
