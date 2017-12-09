import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
	private ArrayList<Card> list = new ArrayList<Card>();
	
	public Hand() {
		list = new ArrayList<Card>();

	}

	public void add(Card card) {
		list.add(card);
	}

	public void print() {
		for (Card n : list) {
			System.out.println(n);
		}
	}

	public void sort() {
		Collections.sort(list);
	}

	public int totalValue() {
		int totalValue = 0;
		for (Card c : list) {
			totalValue += c.getValue();
		}
		return totalValue;
	}

	@Override
	public int compareTo(Hand o) {

		return this.totalValue() - o.totalValue();
	}

	public void sortAgainstSuit() {
		Collections.sort(list, new SortAgainstSuitAndValue());
	}
}
