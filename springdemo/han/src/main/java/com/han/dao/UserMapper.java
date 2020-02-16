package com.han.dao;

import com.han.entity.User;

public interface UserMapper {
    /**
     * find user by id
     *
     * @param uid
     * @return
     */
    User findUser(String uid);

    /**
     * insert user
     *
     * @param user
     */
    void addUser(User user);

    /**
     * remove user
     *
     * @param uid
     */
    void removeUser(String uid);

    /**
     * update user
     *
     * @param user
     */
    void updateUser(User user);
}
