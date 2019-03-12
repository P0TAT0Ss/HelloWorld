package pers.han.StuSys;


import java.util.Scanner;

public class operationSide {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /**
         *  courses list and student information
         */
        courseList list = new courseList();
        Student stu = new Student();

        /**
         *  set student information
         */
        System.out.println("WELCOME!\nPlease input your id and name");
        System.out.println("ID:");
        stu.setId(scanner.nextLine());
        System.out.println("Name");
        stu.setName(scanner.nextLine());

        /**
         *  display course
         */
        System.out.println("Welcome!\n"+
                stu.getName()+": No."+stu.getId()+
                "\nselect your courses please");
        list.forEach();

        /**
         *  creat setCourse object
         *  method select courses
         */
        setCourse setC = new setCourse();
        setC.addCourses();
        setC.stuContains();
        /**
         *  Determine quit or not
         */


    }
}
