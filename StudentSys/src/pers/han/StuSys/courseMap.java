package pers.han.StuSys;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class courseMap {

    Map<String,Course> courses;
    private Scanner scan;
    private Scanner scanner;

    courseMap() {

        scan = new Scanner(System.in);
        scanner = new Scanner(System.in);
        this.courses = new HashMap<>();

    }

    public void putCourses() {

        System.out.println("Input courses number: ");
        int cNum = scanner.nextInt();
        for (int i = 0;i<cNum;i++) {

            System.out.println("input your NO. "+(i+1)+" course\nInput course sequence:");
            String key = scan.nextLine();
            Course c = courses.get(key);

            if (c == null){
                System.out.println("Input course name");
                String courseName = scan.nextLine();

                Course course = new Course();
                course.setName(courseName);

                courses.put(key,course);
            } else {
                System.out.println("Existed");
                continue;
            }
        }

    }


    public void entrySet() {

        Set<Map.Entry<String,Course>> set = courses.entrySet();

        for (Map.Entry Set: set) {
            Course course = (Course)Set.getValue();
            System.out.println(Set.getKey()+"\t"+course.getName());
        }

    }

    public void remove() {

        System.out.println("Input key to remove");
        String key = scan.nextLine();
        Course course = courses.get(key);
        while(true) {
            if (course != null) {
                courses.remove(key);
                break;
            } else {
                System.out.println("Not exist" +
                        "\nPlease check your input");
                continue;
            }
        }

    }

    public void courseMapContains() {
        System.out.println("find by key or value\n" +
                "Key: k\tValue: v");
        String input = scan.nextLine();
        if (input.equals("k")) {
            System.out.println("Input key value");
            String key = scan.nextLine();

            if(courses.containsKey(key)) {
                System.out.println("Key: "+key+" Exist");
            } else {
                System.out.println("Key: "+key+" Not exist");
            }

        } else if(input.equals("v")) {
            System.out.println("Input value name");
            String name = scan.nextLine();

            Course course = new Course();
            course.setName(name);

            if(courses.containsValue(course)) {
                System.out.println("Course name: "+course.getName()+" Exist");
            } else {
                System.out.println("Course name: "+course.getName()+"Not exist");
            }

        }


    }

    public static void main(String[] args) {

        courseMap coursemap = new courseMap();
        coursemap.putCourses();
        coursemap.entrySet();
        coursemap.courseMapContains();

    }

}
