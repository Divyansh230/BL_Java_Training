package Generics.Multilevel_University_CourseManagementSystem.model;

public abstract class CourseType {
    private String couse_Id;
    private double price;

    public CourseType(String couse_Id, double price) {
        this.couse_Id = couse_Id;
        this.price = price;
    }
   public abstract String getType();

}
