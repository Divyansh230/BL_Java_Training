package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Java8Demo {

    public static void main(String[] args) {

        // Lambda Expression
        MathOperation add = (a,b) -> a+b;
        MathOperation sub = (a,b) -> a-b;
        MathOperation mul = (a,b) -> a*b;
        MathOperation div = (a,b) -> a/b;

        System.out.println(add.operate(1,2));
        System.out.println(sub.operate(1,2));
        System.out.println(mul.operate(1,2));
        System.out.println(div.operate(1,2));

        // Predicate
        Predicate<Integer> isEven = a -> a%2==0;
        System.out.println(isEven.test(2));

        Predicate<String> A_Start = a -> a.startsWith("A");
        Predicate<String> N_End = a -> a.endsWith("n");
        Predicate<String> A_Start_and_N_End = A_Start.and(N_End);

        System.out.println(A_Start_and_N_End.test("Arjun"));

        // Function
        Function<Integer,Integer> doubIt = a -> a*2;
        Function<Integer,Integer> tripIt = a -> a*3;

        Function<Integer,Integer> function = doubIt.andThen(tripIt);
        System.out.println(function.apply(2));

        // Consumer
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(25);

        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Consumer<List<Integer>> listConsumer = x -> {
            for(int i : x) System.out.println(i);
        };

        listConsumer.accept(ls);

        // Supplier
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        // BiPredicate
        BiPredicate<Integer,Integer> sumEven = (x,y) -> (x+y)%2==0;
        System.out.println(sumEven.test(2,3));

        // BiConsumer
        BiConsumer<Integer,Integer> sum = (x,y) -> {
            System.out.println(x+y);
        };
        sum.accept(1,2);

        // Method Reference
        List<String> students = Arrays.asList("Ram","Shyam","Ghanshyam");
        students.forEach(System.out::println);

        // Constructor Reference
        List<String> mobile = Arrays.asList("Samsung","Motorola","OnePlus","iPhone");

        List<MobilePhone> phones =
                mobile.stream()
                        .map(MobilePhone::new)
                        .collect(Collectors.toList());

        System.out.println(phones.size());
    }

    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }

    static class MobilePhone {
        String brand;

        public MobilePhone(String brand) {
            this.brand = brand;
        }
    }
}
