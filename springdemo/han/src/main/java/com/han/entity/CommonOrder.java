package com.han.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Jue-PC
 */
@Getter
@Setter
@ToString
public class CommonOrder {
    private int    id;
    private int    usr_id;
    private int    good_id;
    private int    good_num;
    private String merchant_name;
    private String good_name;
    private double good_price;
    private String statue;
}
