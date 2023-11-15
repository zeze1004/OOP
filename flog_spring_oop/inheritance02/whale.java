package flog_spring_oop.inheritance02;

public class whale extends mammal implements swim{
    whale() {
        myClass = "whale";
    }

    @Override
    public void swim() {
        System.out.println(myClass +"가 수영 중");
    }
}
