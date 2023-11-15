package object._01_ticket;

import java.util.ArrayList;
import java.util.List;

/**
 * 초대장을 티켓으로 교환해주거나 티켓을 판매하는 매표소
 */
public class TicketOffice {
	private Long amount;
	private List<Ticket> tickets = new ArrayList<>();

	public TicketOffice(Long amount, List<Ticket> tickets) {
		this.amount = amount;
		this.tickets = tickets;
	}

	public Ticket getTicket() {
		return tickets.remove(0);
	}

	public void minusAmount(Long amount) {
		this.amount -= amount;
	}

	public void plusAmount(Long amount) {
		this.amount += amount;
	}
}
