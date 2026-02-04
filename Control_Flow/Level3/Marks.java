package Control_Flow.Level3;

public class Marks {
    public static void main(String[] args) {
        int phy=85, chem=78, math=90;
        int total=phy+chem+math;
        double percentage=(total/300.0)*100;
        char grade=' ';
        if(percentage>=80){
            grade='A';
        }
        else if(percentage<79){
            grade='B';
        }
        else if(percentage>=40){
            grade='C';
        }
        else{
            grade='F';
        }
    }
    
}
