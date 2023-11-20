package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String text;

    public Dog() {

    }

    public Dog(String text) {
        this.text = text;
    }

    @Override
    void say() {
        System.out.println(text);
    }

    @Override
    public String toString() {
        return "I am Dog";
    }
}
