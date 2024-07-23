package OOP_lessons.Seminar2.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speakable> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Radio());

        NoiseZoo noiseZoo = new NoiseZoo(animals);

        noiseZoo.speakAll();

    }
}
