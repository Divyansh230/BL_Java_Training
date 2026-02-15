package Generics.Multilevel_University_CourseManagementSystem;

import Generics.Multilevel_University_CourseManagementSystem.model.CourseType;

import java.util.ArrayList;
import java.util.List;

public class Course <T extends CourseType> {
    List<T> courses=new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public void getAllCourses() {
        for (T course : courses) {
            System.out.println(course);
        }
    }

}
