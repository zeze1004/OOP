package object._01_ticket;

/**
 * 손님 가방에 초대권, 현금만 있을 수 있다.
 */
public class Bag {
	private Long amount;
	private Invitation invitation;
	private Ticket ticket;


	public Bag(Long amount) {
		this.amount = amount;
	}

	public Bag(Long amount, Invitation invitation) {
		this.amount = amount;
		this.invitation = invitation;
	}

	public Long hold(Ticket ticket) {
		if (hasInvitation()) {
			setTicket(ticket);
			return 0L;
		} else {
			setTicket(ticket);
			minusAmount(ticket.getFee());
			return ticket.getFee();
		}
	}

	// 가방에 초대장 유무 확인
	// 초대장이 없으면 티켓을 사야함
	private boolean hasInvitation() {
		return invitation != null;
	} // 내부 hold()에만 사용하므로 private로 변경

	private void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	private void minusAmount(Long amount) {
		this.amount -= amount;
	}

}
