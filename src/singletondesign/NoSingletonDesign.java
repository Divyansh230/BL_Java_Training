package singletondesign;

public class NoSingletonDesign {
    public NoSingletonDesign() {
        System.out.println("NoSingletonDesign");
    }

    public static void main(String[] args) {
        NoSingletonDesign s1 = new NoSingletonDesign();
        NoSingletonDesign s2 = new NoSingletonDesign();

        System.out.println(s1 == s2);
    }
}
