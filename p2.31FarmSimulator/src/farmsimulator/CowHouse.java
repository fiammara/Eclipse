package farmsimulator;

import java.util.Collection;

public class CowHouse {
	private BulkTank tank;
	private MilkingRobot milkingRobot;

	public CowHouse(BulkTank tank) {
		this.tank = tank;
	}

	public BulkTank getBulkTank() {
		return this.tank;
	}

	public void installMilkingRobot(MilkingRobot milkingRobot) {
		this.milkingRobot = new MilkingRobot();
		this.milkingRobot.setBulkTank(this.tank);
	}

	public void takeCareOf(Cow cow) {
		try {
			this.milkingRobot.milk(cow);
		} catch (Exception e) {
			throw new IllegalStateException();
		}
	}

	public void takeCareOf(Collection<Cow> cows) {
		for (Cow n : cows) {
			takeCareOf(n);
		}
	}

	public String toString() {
		return Math.ceil(this.tank.getVolume()) + "/" + Math.ceil(this.tank.getCapacity());
	}

}
