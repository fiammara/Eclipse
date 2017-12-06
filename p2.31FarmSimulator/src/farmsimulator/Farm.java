package farmsimulator;

import java.util.ArrayList;

import java.util.List;

public class Farm implements Alive {
	private String owner;
	private CowHouse barn;
	private List<Cow> herd;
	
		
	public Farm(String owner, CowHouse barn) {
		super();
		this.owner = owner;
		this.barn=barn;
		this.herd=new ArrayList<Cow>();
	}

	public void addCow(Cow cow){
	this.herd.add(cow);
	}
	@Override
	public void liveHour() {
		for (Cow n: herd) {
			n.liveHour();
		}
		}
	
	public void manageCows() {
		
		barn.takeCareOf(herd);}
	
	public String getOwner() {
		return owner;
	}
	
	public void installMilkingRobot(MilkingRobot milkingRobot){
		barn.installMilkingRobot(milkingRobot);
	}
	public String toString() {
		       String title = "Farm owner: " + this.owner + "\n"
		         + "Barn bulk tank: " + this.barn.toString() + "\n"
		        + "Animals:" + "\n";
		       for (Cow c : herd) {
		           title += "        " + c.toString() + "\n";
		       }
		       return title;
		   }
}
