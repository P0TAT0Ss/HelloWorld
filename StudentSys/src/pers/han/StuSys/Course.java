package pers.han.StuSys;


/**
 * course class
 */
public class Course implements Comparable<Course> {

    private String name;
    private String id;

    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime*result+((name == null)? 0: name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Course)) {
            return false;
        }
        Course course = (Course)obj;
        if(course.name == null) {
            if (this.name == null) {
                return true;
            } else
                return false;
        } else {
            if ((course.name.equals(this.name))) {
                return true;
            } else
                return false;
        }
    }

    @Override
    public int compareTo(Course o) {

        return this.getId().compareTo(o.getId());

    }
}


