package Interfaces.Animal;

public interface Animal {
    static final int age = 10;
    int agei=20;
    public abstract void eat();
    void sleep();


    public static void info(){
        System.out.println("It is an animal Interface");
    }

    public default void running(){
        System.out.println("It is a running animal");
    }
}
