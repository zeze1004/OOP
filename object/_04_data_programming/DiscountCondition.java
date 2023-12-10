package object._04_data_programming;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiscountCondition {
    private DiscountConditionType type;
    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
}
