package per.han.mapper;


import per.han.PO.User;

public interface userMapper {
    int insert(User user);
    void query(String username);
    int delete(String username);
    void update(String username);
}
