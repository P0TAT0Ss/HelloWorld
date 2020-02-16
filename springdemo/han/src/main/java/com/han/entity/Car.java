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
public class Car {
    private int    id;
    private int    usr_id;
    private int    good_id;
    private double good_price;
    private String good_name;
}
