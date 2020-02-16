package com.han.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author Jue-PC
 */
@Getter
@Setter
@ToString
public class User {
    private int    id;
    private int    identity;
    private String username;
    private String pwd;
    private String name;
    private String address;
    private String phone;
    private Date create_at;
    private Date update_at;
}
