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
public class Goods {
    private int    id;
    private int    usr_id;
    private int    good_id;
    private double price;
    private String name;
    private Date   create_at;
    private Date   update_at;
}
