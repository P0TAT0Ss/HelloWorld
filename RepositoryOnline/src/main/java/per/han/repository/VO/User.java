package per.han.repository.VO;


import javafx.util.Builder;

public class User {
    private final String username;
    private final String password;
    private final String create_at;
    private final String update_at;

    private User(builder builder) {
        username = builder.username;
        password = builder.password;
        create_at = builder.create_at;
        update_at = builder.update_at;
    }

    public static class builder implements Builder {
        private final String username;
        private final String password;

        private String create_at;
        private String update_at;

        public builder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public builder create_at(String val1) {
            create_at = val1;
            return this;
        }

        public builder update_at(String val2) {
            update_at = val2;
            return this;
        }

        @Override
        public User build() {
            return new User(this);
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCreate_at() {
        return create_at;
    }

    public String getUpdate_at() {
        return update_at;
    }

    @Override
    public String toString() {
        return getUsername() + "||" + getPassword() + "||" + getCreate_at();
    }
}
