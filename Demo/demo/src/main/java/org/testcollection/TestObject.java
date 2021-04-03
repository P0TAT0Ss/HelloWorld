package org.testcollection;

import lombok.Getter;
import lombok.Setter;

/**
 * @author OS
 */
public class TestObject {

    @Getter @Setter String name;
    @Getter @Setter int age;

    TestObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
