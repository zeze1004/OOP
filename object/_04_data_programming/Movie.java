package object._04_data_programming;

import java.time.Duration;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
    // 데이터 중심 설계
    // Movie에 필요한 데이터 먼저 결정
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType; // 할인 정책의 종류를 결정
    private Money discountAmount;
    private double discountPercent;
}
