public class Volume_Earth {
    public static void main(String args[]){
        int radius=6371; // in kilometers
        double volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
        System.out.println("Volume of the Earth: "+volume+" cubic kilometers");
    }
    
}
