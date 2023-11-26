package object._02_oop_programming;

// 할인조건 중 순번조건
public class SequenceCondition implements DiscountCondition {
    private int sequence;   // 상영 순번

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    // 파라미터로 전달된 Screening의 상영 순번과 일치할 경우 할인 가능한 것으로 판단
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}