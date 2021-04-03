package org.TestIO;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * @author OS
 */
public class SerializeObject implements Serializable {

    @Getter @Setter private String name;
    @Getter @Setter private String sex;
    @Getter @Setter private int age;
    @Getter @Setter private double height;
    @Getter @Setter private double weight;

    SerializeObject( String sex,String name, int age, double height,double weight ) {
        this.sex = sex;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}
