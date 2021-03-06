package src.com.bencyq.IO;

import java.io.Serializable;

public class People implements Serializable {
    private static final long serialVersionUID = 1L;
    int age;
    String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "People [age=" + age + ", name=" + name + "]";
    }
}
