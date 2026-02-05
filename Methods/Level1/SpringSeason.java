package Methods;

public class SpringSeason {
    public static void main(String[] args) {
        int month=3;
        String season=getSeason(month);
        System.out.println("Season: " + season);
    }
    public static String getSeason(int month) {
        if (month == 3 || month == 4 || month == 5) {
            return "Spring";
        } else {
            return "Not Spring";
        }
    }
    
}
