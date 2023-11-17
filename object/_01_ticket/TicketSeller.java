package object._01_ticket;

/**
 * TicketOffice에서 티켓을 판매하는 매표원
 * TicketOffice 클래스를 알고있음
 */
public class TicketSeller {
	private TicketOffice ticketOffice;

	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	// 매표소는 관람객이 지불한 금액만 확인하면 됨
	public void sellTo(Audience audience) {
		ticketOffice.sellTicketTo(audience);
	}
}