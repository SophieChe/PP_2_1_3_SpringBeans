package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private String text;

    public Cat() {

    }

    public Cat(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }

    @Override
    void say() {
        System.out.println(text);
    }
}
