public class Pen_Distribution {
    public static void main(String[] args) {
        int totalPens=14,students=3;
        int penperStudent=totalPens/students;
        int remainingPens=totalPens%students;

        System.out.println("Each student gets "+penperStudent+" pens");
        System.out.println("Remaining pens in the box: "+remainingPens);
    }
    
}
