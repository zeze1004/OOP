package flog_spring_oop.inheritance02;

public class bat extends mammal implements fly {
    bat() {
        myClass = "bat";
    }

    @Override
    public void fly() {
        System.out.println(myClass + "가 날고 있음");
    }
}
