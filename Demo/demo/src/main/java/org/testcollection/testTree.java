package org.testcollection;

import java.util.ArrayList;
import java.util.List;

public class testTree {
    // 左子节点
    public testTree leftNode;
    // 右子节点
    public testTree rightNode;

    // 值
    public Object value;

    // 插入 数据
    public void add(Object v) {
        // 如果当前节点没有值，就把数据放在当前节点上
        if (null == value)
            value = v;

            // 如果当前节点有值，就进行判断，新增的值与当前值的大小关系
        else {
            // 新增的值，比当前值小或者相同

            if ((Integer) v -((Integer)value) <= 0) {
                if (null == leftNode)
                    leftNode = new testTree();
                leftNode.add(v);
            }
            // 新增的值，比当前值大
            else {
                if (null == rightNode)
                    rightNode = new testTree();
                rightNode.add(v);
            }

        }

    }

    // 中序遍历所有的节点
    public List<Object> values() {
        List<Object> values = new ArrayList<>();

        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values());

        // 当前节点
        values.add(value);

        // 右节点的遍历结果
        if (null != rightNode)

            values.addAll(rightNode.values());

        return values;
    }

    public static void main(String[] args) {

        int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };

        testTree roots = new testTree();
        for (int number : randoms) {
            roots.add(number);
        }

        System.out.println(roots.values());

    }
}

//package pers.han.testcollection;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class testTree {
//
//    public testTree leftNode;
//    public testTree rightNode;
//    public testObject value;
//
//    public testTree() {
//
//    }
//
//    public void treeAdd(testObject obj) {
//
//        if (value == null) {
//            value = obj;
//        } else {
//            if (obj.age > value.age) {
//                if (leftNode == null) {
//                    leftNode = new testTree();
//                    leftNode.treeAdd(value);
//                }
//            } else {
//                if (rightNode == null) {
//                    rightNode = new testTree();
//                    rightNode.treeAdd(obj);
//                }
//            }
//        }
//    }
//
//    public List<testObject> traverse() {
//        List<testObject> traverse = new ArrayList<>();
//        if (leftNode != null) {
//            traverse.addAll(leftNode.traverse());
//        }
//        traverse.add(value);
//        if (rightNode != null) {
//            traverse.addAll(rightNode.traverse());
//        }
//        return traverse;
//    }
//
//    public static void main(String[] args) {
//
//        Random random = new Random();
//        testTree test = new testTree();
//
//        for (int i = 0; i < 1000; i++) {
//            char[] chars = new char[5];
//            StringBuilder name = new StringBuilder();
//            for (char c :
//                    chars) {
//                c = (char) random.nextInt(100);
//                name.append(c);
//            }
//            testObject newObject = new testObject(name.toString(), random.nextInt(100));
//            test.treeAdd(newObject);
//        }
//        System.out.println(test.traverse());
//
//    }
//
//}
