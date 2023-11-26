package object._02_oop_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 할인 정책(DiscountPolicy)을 상속받는 금액 할인 정책과 비율 할인 정책이 있음
// 할인 정책은 인스턴스 생성할 필요가 없기에 추상 클래스로 구현
public abstract class DiscountPolicy {
    // 하나의 할인정책 인스턴스에는 여러개의 할인 조건(conditions)들이 존재
    private List<DiscountCondition> conditions = new ArrayList<>();

    // 할인 정책에는 여러개의 할인 조건이 있을 수 있으므로 생성자가 여러개의 할인 조건을 가질 수 있음
    // 따라서, DiscountPolicy 생성자는 여러 개의 DiscountCondition 인스턴스를 허용
    public DiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    // 전체 할인 조건을 차례대로 DiscountCondition의 isSatisfiedBy 메서드를 호출
    // 할인 조건 만족 유무 반환
    // 만족하는 DiscountCondition이 있다면 추상메서드인 getDiscountAmount 를 호출해 할인 요금 계산
    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;  // 할인 금액이 없는 경우
    }

    // DiscountPolicy가 금액 계산에 필요한 흐름 정의하지만,
    // 실제로 요금을 계산하는 부분은 추상메서드인 getDiscountAmount에 위임(자식클래스에서 오버라이딩한 메서드)
    // 템플릿 메서드: 부모 클래스에 기본적인 알고리즘 흐름 구현하고 중간에 필요한 처리를 자식 클래스에 위임
    abstract protected Money getDiscountAmount(Screening screening);
}