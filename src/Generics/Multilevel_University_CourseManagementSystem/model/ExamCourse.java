package Generics.Multilevel_University_CourseManagementSystem.model;

public class ExamCourse extends CourseType{

    public ExamCourse(String couse_Id) {
        super(couse_Id, 300);
    }

    @Override
    public String getType() {
        return "Exam Course";
    }
}
