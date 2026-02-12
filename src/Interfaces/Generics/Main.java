package Interfaces.Generics;

public class Main {
    public static void main(String[] args) {
//        Box<Integer> box = new Box();
//        box.setValue(12);
//        Integer i=(Integer)box.getValue();
//        System.out.println(i);

        Pair<String, Integer> p=new Pair<>("Age",30);
        System.out.println("Key: "+p.getKey());
        int i = +p.getValue();
        int i1 = +p.getValue();
        //System.out.println("Value":/+p.getValue());
    }
}
