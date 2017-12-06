package farmsimulator;

public class MilkingRobot {
	private BulkTank tank;

	public MilkingRobot() {
		super();
	}

	public BulkTank getBulkTank() {
		 if (tank == null){
	            return null;
	        } else {	            
	            return tank;
	        }
	}

	public void setBulkTank(BulkTank tank) {
		this.tank = new BulkTank();
	}

	public void milk(Milkable milkable) {
		
		if (this.tank==null) {
	        throw new IllegalStateException("The milking robot hasn`t been installed"); }
			
		else {	
			
		this.tank.addToTank(milkable.milk());}
	
	}

	

}
