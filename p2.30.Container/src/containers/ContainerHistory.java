package containers;

import java.util.ArrayList;

public class ContainerHistory {
	private ArrayList<Double> list;

	public ContainerHistory() {
		list = new ArrayList<Double>();

	}

	public void add(double situation) {
		list.add(situation);
	}

	public void reset() {
		list.clear();
	}

	public String toString() {

		return list.toString();
	}

	public double maxValue() {
		double maxV = list.get(0);
		for (Double n : list) {
			if (n > maxV) {
				maxV = n;
			}
		}
		return maxV;
	}

	public double minValue() {
		double minV = list.get(0);
		for (Double n : list) {
			if (n < minV) {
				minV = n;
			}
		}
		return minV;
	}

	public double average() {
		double sum = 0.00;
		double count = 0.00;
		double avg = 0.00;

		for (Double n : list) {
			sum += n;
			count++;
		}

		if (count > 0) {
			avg = sum / count;
		}

		return avg;
	}

	public double greatestFluctuation() {
		if (list.size() < 2) {
			return 0;
		}
		double grflu = 0.00;
		for (int i = 1; i < list.size(); i++) {
			double fluctuation = Math.abs(list.get((i - 1)) - list.get(i));
			if (fluctuation > grflu) {
				grflu = fluctuation;
			}
		}
		return grflu;
	}

	public double variance() {
		if (list.size() < 2) {
			return 0;
		}
		double mean = this.average();
		double temp = 0;
		for (Double item : list) {
			temp +=Math.pow((item - mean), 2);
		}
		return temp / (list.size() - 1);
	}
}
