package flog_spring_oop.inheritance02;

public class penguin extends bird implements swim {
    penguin() {
        myClass = "penguin";
    }

    @Override
    public void swim() {
        System.out.println(myClass + "이 수영 중");
    }
}
