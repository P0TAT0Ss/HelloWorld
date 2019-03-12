package pers.han.StuSys;

import java.util.*;

/**
 * coursesToSelect
 * creat course list
 */
public class courseList {

    public List<Course> coursesToSelect;

    public courseList() {

        this.coursesToSelect = new ArrayList<>();

        /**
         * add course
         */
        Course course_1 = new Course();
        Course course_2 = new Course();
        Course course_3 = new Course();
        Course course_4 = new Course();
        Course course_5 = new Course();
        Course course_6 = new Course();

        /**
         * set attribute
         */
        course_1.setId("1");
        course_1.setName("computer basic");
        course_2.setId("2");
        course_2.setName("arithmetic");
        course_3.setId("3");
        course_3.setName("thinking in java");
        course_4.setId("4");
        course_4.setName("head first java");
        course_5.setId("5");
        course_5.setName("web basic");
        course_6.setId("6");
        course_6.setName("mysql");

        /**
         * add course to list
         */
        coursesToSelect.add(course_2);
        coursesToSelect.add(course_3);
        coursesToSelect.add(course_1);
        coursesToSelect.add(course_6);
        coursesToSelect.add(course_5);
        coursesToSelect.add(course_4);
    }


    /**
     * iterator courses
     */
    public void forEach() {
        for (Course course: coursesToSelect) {
            System.out.println(course.getId()+"\t"+course.getName());
        }
    }
}
