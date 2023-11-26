package object._02_oop_programming;

// 할인정책이 없는 영화가 사용하는 할인 정책 클래스
public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}