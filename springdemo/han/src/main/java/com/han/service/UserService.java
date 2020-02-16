package com.han.service;

import com.han.entity.User;

/**
 * @author Jue-PC
 */
public interface UserService {
    /**
     * find user by id
     *
     * @param usr_id
     * @return
     */
    User findUser(String usr_id);

    /**
     * insert user
     *
     * @param user
     */
    void addUser(User user);

    /**
     * remove user
     *
     * @param usr_id
     */
    void removeUser(String usr_id);

    /**
     * update user
     *
     * @param user
     */
    void updateUser(User user);
}
