package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    @Autowired
    private Timer timer;

    public AnimalsCage(Timer timer) {
        this.timer = timer;
    }
    public Timer getTimer() {
        return timer;
    }

    @Autowired
    private Animal animal;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
