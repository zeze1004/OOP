package flog_spring_oop.inheritance03;

public class Penguin extends Animal {
    public String habitat;

    public void showHabit() {
        System.out.printf("%s는 %s에 살아\n", name, habitat);
    }
}
