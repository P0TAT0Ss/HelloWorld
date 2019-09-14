package org.testcollection;


import java.util.LinkedList;
import java.util.List;


public class MineStack<E> implements Stack<E> {

    List<E> myStack;

    MineStack() {
        myStack = new LinkedList<>();
    }

    @Override
    public void pull(E i) {
        myStack.add(i);
    }

    @Override
    public E push() {

        return myStack.get(myStack.size() - 1);

    }

    @Override
    public E peek() {

        return myStack.get(0);
    }
}
