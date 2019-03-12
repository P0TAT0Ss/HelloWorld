package pers.han.StuSys;

/**
 * student system of chose lessons
 * @author han
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class setCourse {

    private Scanner scan;
    private Scanner scanner;
    private Student student;
    private courseList courses;
    public List<Course> coursesToStu;

    public setCourse() {

        this.coursesToStu = new ArrayList();
        scan = new Scanner(System.in);
        scanner = new Scanner(System.in);
        student = new Student();
        courses = new courseList();

    }

    public void addCourses() {

        /**
         *  select and add course to student Set
         */
        for (int i = 1;i<4;i++) {
            System.out.println("please select your NO." + i + "book");
            String s = scan.nextLine();
            for (Course c : courses.coursesToSelect) {
                if (c.getId().contains(s)) {
                    student.courses.add(c);
                } else {
                    continue;
                }
            }
        }

        /**
         *  determine whether the number of courses is equal to 3
         */
        if (!(student.courses.size() == 3)) {
            System.out.println("illegal operation" +
                    "\nyou must chose 3 courses and can't repeat selection" +
                    "\nplease reselect your courses!!!\n");
            student.courses.clear();
            addCourses();
        }else {
            System.out.println("SUCCESS!\nconfirm your courses");
            student.forEach();
        }

    }

    /**
     * determine courses list contains element of input
     */
    public void listContains() {

        System.out.println("please input course name to check");
        String inputName = scan.nextLine();
        Course Couse = new Course();

        Couse.setName(inputName);

        System.out.println("Name: "+Couse.getName());
        if (courses.coursesToSelect.contains(Couse)) {
            System.out.println("exist");
        } else
            System.out.println("not exist");
    }

    /**
     * determine element of input contains by student set or not
     */
    public void stuContains() {

        System.out.println("Input course name which you need to find in student's courses set");
        if (scan.hasNextLine()) {

            String courseName = scan.nextLine();

            Course course = new Course();
            course.setName(courseName);

            if (student.courses.contains(course)) {
                System.out.println("Exist");

            } else {
                System.out.println("Not exist");
            }

            System.out.println(course.getName()+"'s index of list: "+courses.coursesToSelect.lastIndexOf(course));

        }
    }

    /**
     * determine quit or other operation
     */
    /*public void Determine() {

        System.out.println("reselect or not\n\tYES:Y\tNO:N");
            String input = scan.nextLine();
            if(input.equals("y")) {
            }else if (input.equals("n")) {
                System.out.println("Bye~~~");
            }else
                Determine();
        }

        */


    public static void main(String[] args) {
    }

}
