package object._02_oop_programming;

import java.time.LocalDateTime;

/**
 * 사용자들이 예매하는 '상영' 클래스
 */
public class Screening {
    private Movie movie;                // 상영할 영화
    private int sequence;               // 순번
    private LocalDateTime whenScreened; // 상영 시작 시간

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    // 영화 예매 메서드
    // 메서드 호출 시, Reservation 인스턴스에 영화 예메에 대한 정보(예매자, 인원수)를 갖고 반환됨
    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    // 금액 계산 메서드
    // 1인당 예매 요금
    private Money calculateFee(int audieceConunt) {
        return movie.calculateMovieFee(this).times(audieceConunt);
    }
}