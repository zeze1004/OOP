package flog_spring_oop.inheritance02;

public class sparrow extends bird implements fly {
    sparrow() {
        myClass = "sparrow";
    }

    @Override
    public void fly() {
        System.out.println(myClass + "가 나는 중");
    }
}
