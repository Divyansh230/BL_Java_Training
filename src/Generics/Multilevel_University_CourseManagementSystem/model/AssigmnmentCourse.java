package Generics.Multilevel_University_CourseManagementSystem.model;

public class AssigmnmentCourse extends CourseType{
    public AssigmnmentCourse(String couse_Id) {
        super(couse_Id, 500);
    }

    @Override
    public String getType() {
        return "Exam Course";
    }
}
