package object._01_ticket;

/**
 * 관람객은 가방을 소지함
 */
public class Audience {
	private Bag bag;

	public Audience(Bag bag) {
		this.bag = bag;
	}

	public Bag getBag() {
		return bag;
	}
}
