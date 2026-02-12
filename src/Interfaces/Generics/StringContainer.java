package Interfaces.Generics;

public class StringContainer implements Container<String> {
    private String value;
    @Override
    public void add(String value) {
        this.value=value;
    }

    @Override
    public String get() {
        return value;
    }
}
