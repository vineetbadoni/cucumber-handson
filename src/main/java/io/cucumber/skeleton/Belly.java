package io.cucumber.skeleton;

public class Belly {
    public void eat(int cukes) {

    }

    public void digestfor(long time_in_minutes) {
        try {
            System.out.println("Waiting to digest..");
            Thread.sleep(time_in_minutes*60*1000);
            System.out.println("Digestion done..");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void growls() {
        System.out.println("My belly hurts!! :(");
    }
}
