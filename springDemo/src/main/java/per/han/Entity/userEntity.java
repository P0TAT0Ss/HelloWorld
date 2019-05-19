package per.han.Entity;


public class userEntity {

    private String username;
    private String password;
    private String create_at;
    private String update_at;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public void setUpdate_at(String update_at) {
        this.update_at = update_at;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUpdate_at() {
        return update_at;
    }

    public String getCreate_at() {
        return create_at;
    }


    @Override
    public String toString() {
        return "username: " + getUsername() + "\tpassword: " + getPassword() + "\ncreate at" + getCreate_at() + "\tupdate at" + getUpdate_at();
    }
}
