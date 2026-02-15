package Generics.Multilevel_University_CourseManagementSystem.model;

public class ResarchCourse extends CourseType{
    public ResarchCourse(String couse_Id, double price) {
        super(couse_Id, price);
    }

    @Override
    public String getType() {
        return "Resarch Course";
    }
}
