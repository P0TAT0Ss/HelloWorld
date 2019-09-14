package org.testcollection;

/**
 * @author Jue-PC
 */
public interface Stack<T> {

    void pull(T i);
    T push();
    T peek();

}
