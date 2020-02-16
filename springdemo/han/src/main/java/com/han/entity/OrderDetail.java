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
public class OrderDetail {
    private int    id;
    private int    order_id;
    private String usr_name;
    private String usr_address;
    private String good_name;
    private String phone;
    private int    good_num;
    private double price;
    private Date   create_at;
    private String statue;
}
