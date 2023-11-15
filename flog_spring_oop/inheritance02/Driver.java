package flog_spring_oop.inheritance02;

public class Driver {
    public static void main(String[] args) {
        fly wing1 = new bat();
        wing1.fly();

        fly wing2 = new sparrow();
        wing2.fly();

        swim[] swimmers = new swim[2];

        swimmers[0] = new whale();
        swimmers[1] = new penguin();

        for (swim swimmer : swimmers) {
            swimmer.swim();
        }

    }
}
