package pers.han.StuSys;

import java.util.HashSet;
import java.util.Set;


public class Student {

    private String id;
    private String name;
    public Set<Course> courses;

    public Student() {
        this.courses = new HashSet();
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }


    public void forEach() {
        for(Course course: this.courses) {
            System.out.println(course.getId()+"\t"+course.getName());
        }
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result+((name == null)? 0: name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student stu = (Student) obj;
        if (stu.name == null) {
            if (this.name == null) {
                return true;
            } else {
                return false;
            }
        } else {
            if (this.name.equals(stu.name)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
