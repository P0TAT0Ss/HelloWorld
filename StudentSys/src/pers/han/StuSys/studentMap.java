package pers.han.StuSys;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class studentMap {

    private Scanner scan;
    private Student student;

    public Map<String,Student> studentMap;

    /**
     * initial studentMap
     */
    public studentMap() {
        this.studentMap = new HashMap<>();
        scan = new Scanner(System.in);
        student = new Student();
    }

    public void putStu() {

        System.out.println("How many student?");
        int j = scan.nextInt();

        for(int i = 0;i<j;i++) {
            System.out.println("Set No."+(i+1)+" ID: ");
            String id = scan.next();
            student = studentMap.get(id);

            if (student == null) {
                System.out.println("Name:");
                String name = scan.next();
                student = new Student();

                student.setId(id);
                student.setName(name);

                /**
                 * put in map
                 */
                studentMap.put(id,student);
            }else {
                System.out.println("ID used");
                continue;
            }
        }
    }

    /**
     * method replace (without put??)
     */
    public void replace() {

        System.out.println("Here is list of students");
        entrySet();

        System.out.println("which student do you want to replace\nplease input his/her id: ");
        String id = scan.next();

        System.out.println("Input new student name: ");
        String name = scan.next();

        student = new Student();
        student.setName(name);
        studentMap.replace(id,student);

        System.out.println("Success!");
    }

    /**
     * method remove
     */
    public void remove() {

        System.out.println("remove student's ID");
        String id = scan.next();
        student = studentMap.get(id);

        while(true) {
            if(student != null) {
                studentMap.remove(id);
                break;
            }else {
                continue;
            }
        }
    }

    /**
     * iterator by keySet
     */
    public void keySet() {
        Set<String> keySet = studentMap.keySet();
        for(String key: keySet) {
            student = studentMap.get(key);
            if (student != null) {
                System.out.println("student: "+student.getName());
            }else {
                System.out.println("No. "+key+": student not exist");
            }
        }
    }

    /**
     * iterator by entrySet
     */
    public void entrySet() {

        Set<Map.Entry<String,Student>> Students = studentMap.entrySet();
        for (Map.Entry Stu: Students) {
            student = (Student)Stu.getValue();
            System.out.print(Stu.getKey()+"\t");
            System.out.println(student.getName());
        }

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        pers.han.StuSys.studentMap set = new studentMap();
        System.out.println("What do you need: \n" +
                "1: add student\n2: add and remove student\n3: add and replace student");
        String input = scan.next();
        if (input.equals("1")) {
            set.putStu();
            set.entrySet();

        }else if(input.equals("2")) {
            set.putStu();
            set.remove();
            set.entrySet();

        }else if(input.equals("3")) {
            set.putStu();
            set.replace();
            set.entrySet();
        }


    }
}
