package object._01_ticket;

/**
 * 손님 가방에 초대권, 현금만 있을 수 있다.
 */
public class Bag {
	private Long amount;
	private Invitation invitation;
	private Ticket ticket;

	// 손님 가방에는 티켓을 구매할 돈만 있거나, 초대권과 돈만 있는 경우 두 개뿐이므로 생성자로 제약
	public Bag(Long amount) {
		this.amount = amount;
	}

	public Bag(Long amount, Invitation invitation) {
		this.amount = amount;
		this.invitation = invitation;
	}

	// 가방에 초대장 유무 확인
	// 초대장이 없으면 티켓을 사야함
	public boolean hasInvitation() {
		return invitation != null;
	}

	public boolean hasTicket() {
		return ticket != null;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public void minusAmount(Long amount) {
		this.amount -= amount;
	}

	public  void plusAmount(Long amount) {
		this.amount += amount;
	}
}
