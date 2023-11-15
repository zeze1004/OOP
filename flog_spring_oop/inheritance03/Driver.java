package flog_spring_oop.inheritance03;

public class Driver {
    public static void main(String[] args) {
        Penguin proro = new Penguin();

        proro.name = "뽀로로";
        proro.habitat = "남극";

        proro.showName();
        proro.showHabit();

        Animal pingu = new Penguin();

        pingu.name = "핑구";
        pingu.showName();

        // 하위 클래스는 상위 클래스에서 확장되므로 상위 클래스에 없는 메소드, 변수등이 있음
        // 따라서 하위 클래스 타입의 참조변수는 상위클래스 인스턴스를 참조할 수 없음
//        Penguin happyfeet = new Animal();
    }
}
